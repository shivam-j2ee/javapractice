package com.basic;

public class ReverseString4 {

	public static void main(String[] args) {
		String str="Shivam TIwari";
		for (int i = str.length()-1; i >=0; i--) {
			char c=str.charAt(i);
			System.out.print(c);
		}
	}
}
