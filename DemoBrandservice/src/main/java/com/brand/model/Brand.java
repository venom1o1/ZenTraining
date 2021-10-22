package com.brand.model;

import java.util.ArrayList;

import java.util.List;

public class Brand 
{
	private int brandid;
	private String brandname;
	private List<Product> productlist=new ArrayList<>();
	
	
	public Brand() {
	
	}
	public Brand(int bid, String bname) {
		
		this.brandid = bid;
		this.brandname = bname;
		
	}
	public int getBid() {
		return brandid;
	}
	public void setBid(int bid) {
		this.brandid = bid;
	}
	public String getBname() {
		return brandname;
	}
	public void setBname(String bname) {
		this.brandname = bname;
	}
	public List<Product> getProductlist() {
		return productlist;
	}
	public void setProductlist(List<Product> productlist) {
		this.productlist = productlist;
	}
	@Override
	public String toString() {
		return "Brand [bid=" + brandid + ", bname=" + brandname + ", productlist=" + productlist + "]";
	}
	           
}
 