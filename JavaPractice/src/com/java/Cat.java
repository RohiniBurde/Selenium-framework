/**
 * 
 */
package com.java;

/**
 * @author rohini.burde
 * sub class with main method multilevel inheritance
 */
public class Cat extends Dog{

	void sleep(){
		System.out.println("Animal sleeping");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat c=new Cat();
c.bark();
c.eat();
c.sleep();

	}

}
