package cn.itcast.p3.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
		
		
		
		//ʹ��collection�е�iterator������� iterator����
//		Iterator it = coll.iterator();
		/*
		 * hasNext()
		 * next();
		 * remove();
		 */
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		//it������˻�ռ�ÿռ�.����������
		
		
		//Iterator �������ڲ��ṹʵ�ֵġ��ڲ��ࡣ
		//
		for(Iterator it=coll.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}
}