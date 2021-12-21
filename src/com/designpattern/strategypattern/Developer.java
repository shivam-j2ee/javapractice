package com.designpattern.strategypattern;

public class Developer implements Role {

	@Override
	public String definition() {
		return Developer.class.getSimpleName();
	}

	@Override
	public String description() {
		return "develop code" ;
	}

}
