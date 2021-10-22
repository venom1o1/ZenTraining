package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.configuration.DB_Connector;
import com.model.Restaurant;

public class search_restaurant implements res1  {

	
	public void search_restaurants(String name) 
	{
		try (Connection con = DB_Connector.connect();
				PreparedStatement pst = con.prepareStatement("select * from res_details where res_name like '%"+name+"%';"))
		{
			ResultSet res = pst.executeQuery();
			
			while(res.next()) {
				int id = res.getInt("res_id");
				String name1 = res.getString("res_name");
				String address = res.getNString("address");
				String open_time = res.getNString("open_time");
				String close_time = res.getNString("close_time");
				int a_ia = res.getInt("active_inactive");
				System.out.print(id+ " ,");
	  			System.out.print(name1+" ,");
				System.out.print(address+ " ,");
				System.out.print(open_time+" ,");
				System.out.print(close_time+" ,");
				System.out.println(a_ia);
			}
		}
		catch(ClassNotFoundException e  )
		{
			System.out.println(e);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
		
	}

	
	public void add_restaurant(Restaurant r) 
	{
		
		try (Connection con = DB_Connector.connect();
				PreparedStatement pst = con.prepareStatement("insert into res_details (res_id  , res_name , address ,\r\n"
						+ "open_time , close_time , active_inactive ) values(?,?,?,?,?,?);\r\n"))
		{
			pst.setInt(1, r.getRes_id());
			pst.setString(2, r.getRes_name() );
			pst.setString(3, r.getAddress());
			pst.setString(4, r.getOpen_time());
			pst.setString(5, r.getClose_time());
			pst.setInt(6, r.getActive_inactive());
			
			int res= pst.executeUpdate();
			if(res > 0)
			{
				System.out.println("Restaurant Saved \n");
			}
		}catch(ClassNotFoundException e  )
		{
			System.out.println(e);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}


	public void update_restaurant(Restaurant res)  
	{
		try (Connection con = DB_Connector.connect();
				PreparedStatement pst = con.prepareStatement("update res_details set  res_name = ?,"
						+ " address = ?,open_time = ?, close_time =? , active_inactive = ? where res_id = ?;"))
		{
			
			pst.setString(1, res.getRes_name() );
			pst.setString(2, res.getAddress());
			pst.setString(3, res.getOpen_time());
			pst.setString(4, res.getClose_time());
			pst.setInt(5, res.getActive_inactive());
			pst.setInt(6, res.getRes_id());
			
			int ress= pst.executeUpdate();
			if(ress > 0)
			{
				System.out.println("Restaurant Updated \n");
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
	public void delete_restaurant(int id)
	{
		try (Connection con = DB_Connector.connect();
				PreparedStatement pst = con.prepareStatement("delete from res_details where res_id=?"))
		{
			pst.setInt(1, id);
			int res= pst.executeUpdate();
			if(res > 0)
			{
				System.out.println("Restaurant Deleted \n");
			}
			
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void active_inactive(Restaurant res)
	{
		try (Connection con = DB_Connector.connect();
				PreparedStatement pst = con.prepareStatement("select active_inactive from res_details where res_id = ?;"))
		{
			
			pst.setInt(1, res.getRes_id());
			
			int ress= pst.executeUpdate();
			if(ress > 0)
			{
				System.out.println("Restaurant Details are :");
			}
						
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


	
}

