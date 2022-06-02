package com.test;

public class OverloadingEx {
	
	
	public OverloadingEx()  // no-a
	{
	}
	
	public OverloadingEx(int i) // param 
	{
	}
	
	public OverloadingEx(int i , String s) // param 
	{
	}
	
	
	public void addition()
	{
		// code ---  10 10 == 20
	}
	public void addition(int a ,String b)
	{
		
		
	}
	public void addition(String str1 ,int a)
	{
	}
		
	public void addition(int a , int b) // user defined method
	{
		int sum = a + b;
		System.out.println(sum);
	}
	
	// 
	public static void main(String args , String str) {
		System.out.println("--1" +args  +str);
		
	}
	
	
	public static void main(String args , int i) {
		System.out.println("--3" +args + i);
	}
	
	public static void main(String[] args) {
		System.out.println("--2 ");
		main("hello", "Hii");
		main("Hii", 10);
		
		
		
		
		
		
		
		
		/*OverloadingEx obj = new OverloadingEx();
		obj.addition();
		obj.addition(10, 10);
		obj.addition("xyz", 10);*/
	}
	
	
}
