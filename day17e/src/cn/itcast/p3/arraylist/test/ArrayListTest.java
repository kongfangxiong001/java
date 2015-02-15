package cn.itcast.p3.arraylist.test;

import java.util.ArrayList;
import java.util.Iterator;

import cn.itcast.p.been.Person;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Person("list1", 21));
		al.add(new Person("list2", 22));
		al.add(new Person("list3", 23));
		al.add(new Person("list4", 24));

		al.add(5); //�Զ�װ��
		
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Person p = (Person) it.next();
			System.out.println(p.getName() + "---" + p.getAge());
		}
	}
}
