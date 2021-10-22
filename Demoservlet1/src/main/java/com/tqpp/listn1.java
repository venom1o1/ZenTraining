package com.tqpp;

import javax.sql.rowset.serial.SerialArray;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class listn1
 *
 */
@WebListener
public class listn1 implements HttpSessionListener {

	private int activecount = 0;
	private int totalcount=0;
	
	public void sessionCreated(HttpSessionEvent se)
	{
		activecount++;
		totalcount++;
		HttpSession ses = se.getSession();
		ServletContext ctx= ses.getServletContext();
		ctx.setAttribute("activeuser", activecount);
		ctx.setAttribute("Totalusers", totalcount);
		System.out.println("Listener2 executed session created ");
	}
	 public void 
	
    /**
     * Default constructor. 
     */
    public listn1() {
        // TODO Auto-generated constructor stub
    }
	
}
