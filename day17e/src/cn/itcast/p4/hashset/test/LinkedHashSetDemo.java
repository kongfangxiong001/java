package cn.itcast.p4.hashset.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * ����hashset��linkedlist���ص㡣����Ψһ
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