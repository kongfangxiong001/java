package cn.itcast.p3.collection.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		/*
		 * ArrayList
		 */
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		show(c1, c2);

	}

	/**
	 * @param c1
	 * @param c2
	 */
	public static void show(Collection c1, Collection c2) {
		// 给c1添加元素
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		// 给c2添加元素
		c2.add("abc2");
		c2.add("abc6");
		c2.add("abc7");
		
		System.out.println(c1.containsAll(c2));
//		System.out.println(c1.retainAll(c2));
//		System.out.println("c1:"+c1);  //c1:[abc2]

		// 演示addAll
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);

		c1.addAll(c2);
		System.out.println("c1:" + c1); // 可以有重复元素

		c1.removeAll(c2);
		System.out.println("c1:" + c1);
		
	}

	public static void show(Collection coll) {
		// 1、添加元素 add 用具体对象 本身具备不安全性，所以黄色。
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		System.out.println(coll);

		coll.remove("abc2"); // 会改变集合的长度
		System.out.println(coll);
		coll.clear();
		System.out.println(coll);

		System.out.println(coll.contains("abc4"));
	}
}
