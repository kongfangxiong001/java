package cn.itcast.p4.treeset.demo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOrderTest {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new StringComparator());
		
		ts.add("ab");
		ts.add("abfaf");
		ts.add("abfefe");
		ts.add("abfefe");
		ts.add("ab");
		
		Iterator it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}