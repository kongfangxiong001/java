package cn.itcast.p4.collection.demo;

import java.util.ArrayList;
import java.util.List;

/*
 * Collection
 * 		|--List:����Ԫ����������Ԫ�ؿ����ظ�
 * 		|--Set��Ԫ��  ���򣬲��ظ�**
 * 
 * List�����еķ��������Բ����Ǳꡣ
 * 1������
 * 	void add(index,element);
 * 	void add(index.collection);
 * 2��ɾ����
 * 	Object remove(index);
 * 3���޸�
 * 	Object set(index,element);
 * 4����ȡ
 * 	Object get(index);
 *  int indexOf(object);
 *  int lastIndexOf(object);
 *  List subList(from,to);
 * 
 */
public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);
	}

	private static void show(List list) {
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);

		list.add(1, "abc9");
		System.out.println(list);

		// �޸�Ԫ��
		System.out.println("set:" + list.set(1, "abc8"));

		System.out.println(list.remove(1));
		System.out.println(list);
	}

}