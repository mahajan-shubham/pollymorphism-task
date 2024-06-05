 package com.product;

public class Product {
 String name;
 int description;
 int price;
 
 public Product(String name, int description, int price) {
	
	this.name = name;
	this.description = description;
	this.price = price;
}
  void calculateDiscount(){
	  double discount=price/100*10;
	  System.out.println("Discount on product = "+ discount);
  }
  
  void display() {
	  System.out.println("name = " + name);
	  System.out.println("description = " + description);
	  System.out.println("price = " + price);


  }
 
}
