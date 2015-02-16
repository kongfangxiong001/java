package cn.itcast.p4.treeset.demo;

import java.util.Iterator;
import java.util.TreeSet;

import cn.itcast.p.been.Person;

/*
 * treeSet保存的对象 需要 comparable
 * 	让元素具备比较功能。
 * 还可以使用treeSet集合的第二种方式：
 * 	让集合自身具备比较功能。比较器，【接口，比较方法依赖于元素】
 * 	创建集合对象的时候 需要具备比较功能。
 */

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new ComparatorByName()); //使用了比较器

		ts.add(new Person("b", 2));
		ts.add(new Person("c", 3));
		ts.add(new Person("d", 2));
		ts.add(new Person("d", 4));
		ts.add(new Person("d", 3));
		ts.add(new Person("a", 1));

		Iterator it = ts.iterator();
		while (it.hasNext()) {
			Person p = (Person) it.next();
			System.out.println(p.getName() + "---" + p.getAge());
		}
	}

	public static void demo1() {
		TreeSet ts = new TreeSet();

		ts.add("abc");
		ts.add("fjaf");
		ts.add("defe");
		ts.add("eee");
		ts.add("u");

		Iterator it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
