package cn.itcast.p4.hashset.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * 兼有hashset和linkedlist的特点。有序，唯一
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
			HashSet hs = new LinkedHashSet();
			
			hs.add("hahah");
			hs.add("hehe");
			hs.add("hiehie");
			hs.add("hiehie");
			hs.add("hihi");
			
			for(Iterator it = hs.iterator();it.hasNext();){
				System.out.println(it.next());
			}
	}

}
