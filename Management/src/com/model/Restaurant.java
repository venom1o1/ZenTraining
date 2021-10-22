package com.model;

public class Restaurant {

	private int res_id;
	private String res_name;
	private String address;
	private String open_time;
	private String close_time;
	private int active_inactive;
	
	public Restaurant() {
		
	}
	public Restaurant(int res_id, String res_name, String address, String open_time, String close_time,
			int active_inactive) {
		super();
		this.res_id = res_id;
		this.res_name = res_name;
		this.address = address;
		this.open_time = open_time;
		this.close_time = close_time;
		this.active_inactive = active_inactive;
	}
	public int getRes_id() {
		return res_id;
	}
	public void setRes_id(int res_id) {
		this.res_id = res_id;
	}
	public String getRes_name() {
		return res_name;
	}
	public void setRes_name(String res_name) {
		this.res_name = res_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOpen_time() {
		return open_time;
	}
	public void setOpen_time(String open_time) {
		this.open_time = open_time;
	}
	public String getClose_time() {
		return close_time;
	}
	public void setClose_time(String close_time) {
		this.close_time = close_time;
	}
	public int getActive_inactive() {
		return active_inactive;
	}
	public void setActive_inactive(int active_inactive) {
		this.active_inactive = active_inactive;
	}
	@Override
	public String toString() {
		return "Restaurant [res_id=" + res_id + ", res_name=" + res_name + ", address=" + address + ", open_time="
				+ open_time + ", close_time=" + close_time + ", active_inactive=" + active_inactive + "]";
	}

		
}
