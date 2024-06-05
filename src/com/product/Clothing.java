
package com.product;

public class Clothing extends Product {
 String color;
 int size;
 String material;
public Clothing(String name, int description, int price,String color, int size,String material) {
	super( name,description,price);
	this.color = color;
	this.size = size;
	this.material= material;
}
@Override
void calculateDiscount() {
	double discount=price/100*30;
	  System.out.println("Discount on Clothing  = "+ discount);
	
}
@Override
void display() {
	super.display();
	System.out.println("Color = " + color);
	System.out.println("Size = " + size);
	System.out.println("Material= " + material);
	
}

 
}
