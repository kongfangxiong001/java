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
		// ��c1����Ԫ��
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		// ��c2����Ԫ��
		c2.add("abc2");
		c2.add("abc6");
		c2.add("abc7");
		
		System.out.println(c1.containsAll(c2));
//		System.out.println(c1.retainAll(c2));
//		System.out.println("c1:"+c1);  //c1:[abc2]

		// ��ʾaddAll
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);

		c1.addAll(c2);
		System.out.println("c1:" + c1); // �������ظ�Ԫ��

		c1.removeAll(c2);
		System.out.println("c1:" + c1);
		
	}

	public static void show(Collection coll) {
		// 1������Ԫ�� add �þ������ �����߱�����ȫ�ԣ����Ի�ɫ��
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		System.out.println(coll);

		coll.remove("abc2"); // ��ı伯�ϵĳ���
		System.out.println(coll);
		coll.clear();
		System.out.println(coll);

		System.out.println(coll.contains("abc4"));
	}
}