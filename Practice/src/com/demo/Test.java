package com.demo;
//main class
public class Test {

	public static void main(String[] args) {
		
//created object of car and called here
		Car c = new Car();
		c.Price = 200;
		//c.start();
		//created object of bmw and called here
		BMW b = new BMW();
		b.Price = 500;
		b.start();
		b.stop();
	//called override method
		/*System.out.println("****Override******");
		c.start();
		b.start();
		b.theftsafety ();*/
		
		System.out.println("c.Price"+c.Price+"b.Price"+b.Price);
		
	}
	

}
