package com.basic;

import java.util.Scanner;

public class StdinStdout1 {

	
	public static void main(String[] args) {
		
		System.out.println("enter string and int");
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		int i=sc.nextInt();
		
		System.out.println("string is="+str);
		System.out.println("int is ="+i);
		
	}
}
