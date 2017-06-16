package com.java;
class Employee{
	
	int id;
	String name;
	float salary;
	
	void insert(int i, String n, float s){
		id=i;
		name=n;
		salary=s;
		
	}
	 void display(){System.out.println(id+" "+name+" "+salary);}  
}
public class TestEmployee {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEmployee e1= new TestEmployee();
		TestEmployee e2=new TestEmployee();
		/*e1.insert(101,"ajeet",45000);  
	    e2.insert(102,"irfan",25000);  
	     
	    e1.display();
	    e2.display();*/
	    
	}

}
