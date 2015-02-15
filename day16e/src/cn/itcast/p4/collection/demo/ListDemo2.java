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

		// ����
		// for (Iterator it = list.iterator();it.hasNext();) {
		// System.out.println(it.next());
		// }
		for (int x = 0; x < list.size(); x++) {
			System.out.println("get:" + list.get(x));
		}

		/*
		 * Iterator it = list.iterator(); //������ֻ֪�������� 4��Ԫ�ء� while(it.hasNext()){
		 * Object obj = it.next();
		 * //java.util.ConcurrentModificationException.����Ĳ����޸ģ����������޸�ʱ��
		 * if(obj.equals("abc2")){ list.add("abc9"); }else{
		 * System.out.println("next:"+obj); } }
		 */
		// �ڵ��������� ��Ҫʹ�ü��ϲ���Ԫ�أ����׳����쳣��
		// ����ʹ��Iterator���ӽӿ�ListIterator������ڵ����ж�Ԫ�ؽ��в�����

		// listIterator,ֻ��list�������

		ListIterator it = list.listIterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj.equals("abc2")) {
				it.set("abc9"); // ��ʹ��list������������iterator������
			}
		}
	}
}