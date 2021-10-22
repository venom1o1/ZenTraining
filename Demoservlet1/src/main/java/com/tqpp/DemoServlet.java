package com.tqpp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/demo1")
public class DemoServlet extends HttpServlet {

	public DemoServlet() {
		System.out.println("hi in default cons of servlet1");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String method = request.getMethod();
		String username = request.getParameter("fname");
		String passwd = request.getParameter("pass");
		
		
		Cookie c=new Cookie("uname",username );
		c.setMaxAge(3600);
		response.addCookie(c);
		 
		ServletContext ctx = getServletContext();
		ServletConfig cfg=getServletConfig();
		String data = ctx.getInitParameter("url");
		String u=cfg.getInitParameter("user");
		out.print("Data context" + data);
		out.print("Data congfig" + u);
	
		ArrayList<String> al = new ArrayList<>();

		al.add("laptop");
		al.add("iphone");
		al.add("tablet");

		request.setAttribute("items", al);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req,resp);
		
	}
}
