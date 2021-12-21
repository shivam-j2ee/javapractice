package com.designpattern.strategypattern;

public class Manager implements Role {

	@Override
	public String definition() {
		return Manager.class.getSimpleName();
	}

	@Override
	public String description() {
		return "manage team and review code";
	}

	
}
