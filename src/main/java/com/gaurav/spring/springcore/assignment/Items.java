package com.gaurav.spring.springcore.assignment;

public class Items {

	private String itemName;
	private int id;
	private double price;
	private int quantity;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return "Items [itemName=" + itemName + ", id=" + id + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
		
}
