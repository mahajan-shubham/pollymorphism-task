package com.product;

public class Electronics extends Product {
  int warrentyPeriod;
  String brand;
  
public Electronics(String name,int description, int price, int warrentyPeriod, String brand) {
    super(name,description,price);
	this.warrentyPeriod = warrentyPeriod;
	this.brand = brand;
}
 @Override
	 void calculateDiscount(){
		  double discount=price/100*20;
		  System.out.println("Discount on Electronics product = "+ discount);
	  }
 @Override
 void display() {
	 super.display();
	 System.out.println("WarrantyPeriod = " + warrentyPeriod);
	 System.out.println("brand  = " + brand);
	 
 }
	 
}
  
  

