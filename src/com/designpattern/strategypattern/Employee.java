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
	

}
