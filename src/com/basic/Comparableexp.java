package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparableexp  implements Comparable<Comparableexp>{

	public int id;
	public String name;
	public long salary;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	@Override
	public int compareTo(Comparableexp o) {
		return (int)(this.salary-o.salary);
	}

	
	public static void main(String[] args) {
		Comparableexp c1=new Comparableexp();
		Comparableexp c2=new Comparableexp();
		
		c1.setSalary(30001);
		c2.setSalary(2000);
		List<Comparableexp> l=new  ArrayList<>();
		l.add(c1);
		l.add(c2);
		Collections.sort(l);
		for(Comparableexp c:l) {
			System.out.println(c.salary);
		}
		
	}
}
