package controller;

import java.util.Scanner;

import com.dao.res1;
import com.dao.search_restaurant;
import com.model.Restaurant;

public class MainRes {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		boolean flag = true;
		int choice =0;
		

		do {
			System.out.println("1. Search Restaurant");
			System.out.println("2. Add Restaurant");
			System.out.println("3. Update Restaurant");
			System.out.println("4. Delete Restaurant");
			System.out.println("5. Active / Incactive Restaurant");
			
			System.out.println("Enter your choice : ");
			choice = s.nextInt();
			
			switch (choice) {
			
			case 1:
				
				System.out.println("Enter the restaurant you want to search");
				String name = s.next();
				
				res1 res0 =  new search_restaurant();
				res0.search_restaurants(name);
				
				break;
				
				
			case 2:
				
				System.out.println("Enter restaurant ID");
				int res_id = s.nextInt();
				System.out.println("Enter Restaurant Name");
				String res_name = s.next();
				System.out.println("Enter Address ");
				String res_address = s.next();
				System.out.println("Enter Opening Time");
				String open_time = s.next();
				System.out.println("Enter Closing Time");
				String close_time= s.next();
				System.out.println("Enter Active/Inactive");
				int a_ia=s.nextInt();
				
				Restaurant r = new Restaurant(res_id, res_name, res_address, open_time, close_time, a_ia);
				res1 res2 =  new search_restaurant();
				res2.add_restaurant(r);
				
				break;
				
			case 3:
				
				System.out.println("Enter the id of the restaurant you want to update");
				int update_id = s.nextInt() ;
				
				System.out.println("Enter new  Restaurant Name");
				res_name = s.next();
				System.out.println("Enter new Address ");
				res_address = s.next();
				System.out.println("Enter new Opening Time");
				open_time = s.next();
				System.out.println("Enter new Closing Time");
				close_time= s.next();
				System.out.println("Enter new Active/Inactive Status");
				a_ia=s.nextInt();
				
				r = new Restaurant(update_id, res_name, res_address, open_time, close_time, a_ia);
				res1 res3 = new search_restaurant();
				res3.update_restaurant(r);
				
				
				break;
				
			case 4:
				
				System.out.println("Please enter the ID of the restaurant which needs to be deleted :");
				int delete_id = s.nextInt();
				
				res1 res4 =  new search_restaurant();
				res4.delete_restaurant(delete_id);
				
				break;
				
			case 5:
				
				System.out.println("Enter the Restaurant ID to check status ");
				int stat =s.nextInt();
				r = new Restaurant();
				res1 res5 = new search_restaurant();
				res5.active_inactive(r);
				
				break;
			
			default:
				System.out.println("Please enter a valid choice ");
				
				break;
			}
			
		}while(flag);
		s.close();
		

	}

}
