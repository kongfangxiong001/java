package cn.itcast.p4.generic.define.demo;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ���ͣ��Բ������ͽ���ָ�������Ͽ�ܡ�
 * jdk1.5���ֵİ�ȫ���ơ���߰�ȫ�ԡ�
 * 
 * �ô���
 * 	1��������ʱ�ڵ�����ClassCastExceptionת���˱���ʱ�ڡ�
 * 	2��������ѭ��ʱ��ǿ��ת�����鷳��
 * 	
 * <>:ʲôʱ��ʹ�ã����������������Ͳ�ȷ��ʱ�򡣾Ϳ���ʹ��<>����Ҫ�������������ʹ��뼴�ɡ�
 *  ��ʵ<>����һ�����ڽ��վ����������͵Ĳο���Χ��
 *  �ڳ���ֻҪ�õ��˴�<>�ӿڣ��࣬��Ҫ�����յ����õ����͡�
 *  
 *  ���ڱ���ʱ�ڵİ�ȫ��������ʱ�ڵļ�������������ʹ�õļ�����
 *  
 *  class Tool<e1,e2,e3,e4>
 *  
 *  Tool<String,Demo,Person,Integer> = new Tool<String,Demo,Person,Integer>();
 *  
 */

public class GenericDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("hahah");
		// al.add(4); //���ܴ�
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}
}