package cn.itcast.p4.arraylist.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add("hehe");
		hs.add("heihei");
		// hs.add("xixii");
		hs.add("hehe");

		Iterator it = hs.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
