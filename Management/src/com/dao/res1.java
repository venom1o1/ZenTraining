package com.dao;

import com.model.Restaurant;

public interface res1 {

	public void search_restaurants(String name) ;
	public void add_restaurant(Restaurant r);
	public void update_restaurant(Restaurant res);
	public void delete_restaurant(int id);
	public void active_inactive(Restaurant res);
	
}
