package cn.itcast.p4.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);
	}

	private static void show(List list) {
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");

		// 查找
		// for (Iterator it = list.iterator();it.hasNext();) {
		// System.out.println(it.next());
		// }
		for (int x = 0; x < list.size(); x++) {
			System.out.println("get:" + list.get(x));
		}

		/*
		 * Iterator it = list.iterator(); //迭代器只知道里面有 4个元素。 while(it.hasNext()){
		 * Object obj = it.next();
		 * //java.util.ConcurrentModificationException.对象的并发修改，不允许该修改时。
		 * if(obj.equals("abc2")){ list.add("abc9"); }else{
		 * System.out.println("next:"+obj); } }
		 */
		// 在迭代过程中 不要使用集合操作元素，容易出现异常。
		// 可以使用Iterator的子接口ListIterator来完成在迭代中对元素进行操作。

		// listIterator,只有list有这个。

		ListIterator it = list.listIterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj.equals("abc2")) {
				it.set("abc9"); // 不使用list操作，而是用iterator操作。
			}
		}
	}
}
