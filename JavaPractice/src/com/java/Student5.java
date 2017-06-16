package com.java;
//this is example of constructor overloading in java
public class Student5 {
	int id;
	String name;
	int age;
	
	
public Student5(int i,String n) {
id=i;
name=n;	
}	
public Student5(int i,String n,int a) {
id=i;
name=n;	
age=a;
}	

void display(){System.out.println(id+" "+name+" "+ age);}

	public static void main(String[] args) {
Student5 S1= new Student5(101, "Roh");
Student5 S2= new Student5(102, "Rohini",16);
S1.display();
S2.display();
	
	
	}

}
