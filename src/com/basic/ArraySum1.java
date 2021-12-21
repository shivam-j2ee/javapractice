package com.basic;

public class ArraySum1 {

	public int sum(int[]a){
		
		int s=0;
		for (int i = 0; i < a.length; i++) {
			s=s+a[i];
		}
		return s;
	}
	
	public static void main(String[] args) {
		ArraySum1 array=new  ArraySum1();
		int[]a={35,6,20,33,4,56};
		System.out.println(array.sum(a));
	}
	
	
}
