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
	
	//δʹ��1.5���¼��������в���ȫ�ԡ�������ʾ��ɫ
	public static void show(Collection coll){
		//1������Ԫ�ء�add
		coll.add("abc1");
		coll.add("abc2");
		
		//2��ɾ��Ԫ��
		coll.remove("abc2");//��ı䳤��
		//3����ս��
//		coll.clear();
		//4������
		coll.contains("abc1");
		
		coll.size();
		System.out.println(coll.size());
	}
}