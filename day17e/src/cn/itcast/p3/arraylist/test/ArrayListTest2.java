package cn.itcast.p3.arraylist.test;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayListȥ��
 */
public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
		al.add("abc3");
		al.add("abc2");

		al = getSingleElement(al);
		System.out.println(al);
	}

	private static ArrayList getSingleElement(ArrayList al) {

		ArrayList temp = new ArrayList();

		Iterator it = al.iterator();

		while (it.hasNext()) {
			Object obj = it.next();
			if (!temp.contains(obj)) {
				temp.add(obj);
			}
		}
		return temp;
	}
}
