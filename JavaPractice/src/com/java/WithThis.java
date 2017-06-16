package com.java;


class Student123{
	int id;
	String name;
	
	
	
	
	Student123(int id, String name){
		
		this.id=id;
		this.name=name;
		
	}
	
	
	
	
	void display(){System.out.println(id+ " " +name);}
	
}

class WithThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student123 S1 = new Student123(12,"name1");
Student123 S2 = new Student123(121,"name12");

S1.display();
S2.display();

	}

}
