package com.product;

public class TestProduct {
 public static void main(String[] args) {
	 
	Product p1=new Product("TV AND SHIRTS ", 30, 100000);
	p1.calculateDiscount();
	p1.display();
	
	System.out.println("-------------------------------");
	
	Product p2=new Electronics("Laptop", 40, 50000,5,"Acer");
	p2.calculateDiscount();
	p2.display();
	
	System.out.println("-------------------------------");
	
	Product p3=new Clothing(" Shirt ", 2, 4000, "Blue", 40,"Cotton");
	p3.calculateDiscount();
	p3.display();
	
}
}
