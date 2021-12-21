package com.basic;

public class ReverseString2 {

	
	public static void main(String[] args) {
		
		String str= "Shivam Tiwari";
		char[] ch=str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
	}
}
