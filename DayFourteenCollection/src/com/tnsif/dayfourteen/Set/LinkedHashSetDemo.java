package com.tnsif.dayfourteen.Set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(90);
		set.add(20);
        set.add(10);
        set.add(30);
        set.add(48);
        set.add(20);
        set.add(null);
        System.out.println(set);
	}

}
