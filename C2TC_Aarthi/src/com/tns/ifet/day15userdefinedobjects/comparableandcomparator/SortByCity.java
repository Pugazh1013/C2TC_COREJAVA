package com.tns.ifet.day15userdefinedobjects.comparableandcomparator;

import java.util.Comparator;

public class SortByCity implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		return p1.getCity().compareTo(p2.getCity());
	}

}
