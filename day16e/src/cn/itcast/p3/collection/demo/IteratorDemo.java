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
		
		
		
		
		//使用collection中的iterator方法获得 iterator对象
//		Iterator it = coll.iterator();
		/*
		 * hasNext()
		 * next();
		 * remove();
		 */
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		//it到最后了还占用空间.开发用这种
		
		
		//Iterator 是依赖内部结构实现的。内部类。
		//
		for(Iterator it=coll.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}
}
