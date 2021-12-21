package com.basic;

import java.util.Scanner;

public class ReverseString3 {
	
	public static void main(String[] args) {
		
		String str;
		Scanner scn=new Scanner(System.in);
        System.out.println("Enter Your String");
		str=scn.nextLine();
		String[] token = str.split("");    //used split method to print in reverse order
	       for(int i=token.length-1; i>=0; i--)
	        {
	            System.out.print(token[i] + "");
	        }
	}

}
