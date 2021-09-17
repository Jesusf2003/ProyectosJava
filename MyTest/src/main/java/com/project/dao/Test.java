package com.project.dao;

class Tester{
	public Tester(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	int x=1;
	int y=2;
}

public class Test {
	public static void main(String []args) {
//		int a=0, b=0, i=10;
//		for(; i>b;) {
//			a = b++;
//		}
//		System.out.println(a);
		String message = "Hello";
		print(message);
		message += "World!";
		print(message);
	}
	static void print(String message) {
		System.out.print(message);
		message += " ";
	}
}