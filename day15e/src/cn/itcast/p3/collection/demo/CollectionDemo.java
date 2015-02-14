package cn.itcast.p3.collection.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		show(coll);
	}
	
	public static void show(Collection c1,Collection c2){
		
	}
	
	//未使用1.5的新技术，带有不安全性。所以显示黄色
	public static void show(Collection coll){
		//1、添加元素。add
		coll.add("abc1");
		coll.add("abc2");
		
		//2、删除元素
		coll.remove("abc2");//会改变长度
		//3、清空结合
//		coll.clear();
		//4、包含
		coll.contains("abc1");
		
		coll.size();
		System.out.println(coll.size());
	}
}
