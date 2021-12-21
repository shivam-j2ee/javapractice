package com.designpattern.strategypattern;

public class Employee {
	
	private String name;
	private Role role;
	
	
	
	public Employee(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	public void promotion(Role newRole) {
		setRole(newRole);
	}
	
	public static void main(String[] args) {
		Employee e=new Employee("rahul", new Developer());
		System.out.println(e.getName()+" will "+e.getRole().description());
		e.promotion(new Teamlead());
		System.out.println(e.getName()+" will "+ e.getRole().description());
		
		
	}

}
