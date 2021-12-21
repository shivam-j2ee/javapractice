package com.designpattern.strategypattern;

public class Teamlead  implements Role{

	@Override
	public String definition() {
		return Teamlead.class.getSimpleName();
	}

	@Override
	public String description() {
		return "lead a team";
	}

}
