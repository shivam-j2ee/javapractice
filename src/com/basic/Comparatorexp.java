package com.basic;

import java.util.Comparator;

public class Comparatorexp implements Comparator<Comparableexp> {

	@Override
	public int compare(Comparableexp o1, Comparableexp o2) {
		
		return (int)(o1.salary-o2.salary);
	}

}
