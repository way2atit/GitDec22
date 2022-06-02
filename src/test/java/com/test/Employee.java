package com.test;

public class Employee {
	
	int emp_id = 1;  // Object
	String emp_name;
	static String company_name = "IBM";  // class
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.emp_id = 2;	
		e1.emp_name  = "a";
		//e1.company_name ="TCS";
		System.out.println(e1.emp_name);
		System.out.println("e1 : "+e1.emp_id);  //2
		
		
		System.out.println("e1.company_name :"+e1.company_name);
		
		Employee e2 = new Employee();
		e2.emp_name = "b";
		System.out.println("e2 : " +e2.emp_id); //
		
		System.out.println("e2.company_name : "+e2.company_name);
		
	}
	
	
}
class Address extends Employee
{
	
}









