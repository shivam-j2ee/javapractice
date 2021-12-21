package com.basic;

public class ReverseString1 {

	
	public static void main(String[] args) {
		
		String str="Shivam";
		StringBuffer sb=new StringBuffer(str);
		sb=sb.reverse();
		String str1=new String(sb);
		System.out.println(str1);
	}
}
