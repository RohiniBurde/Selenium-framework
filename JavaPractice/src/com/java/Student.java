package com.java;

public class Student {
	
	int id;
	String name;
	static String college="PCE";
	


Student(int i, String n){
	
	id=i;
	name=n;
	
}
void display(){System.out.println(id+" "+name+" "+ college);}

public static void main(String[] args) {

Student s1= new Student(89,"Rohini");
Student s2= new Student(892,"Roh");
s1.display();
s2.display();


}


}


