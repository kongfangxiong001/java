package cn.itcast.p4.hashset.test;

import java.util.HashSet;
import java.util.Iterator;

import cn.itcast.p.been.Person;
/*
 * ͬ������ͬ������Ϊһ���ˡ������ظ�
 */
public class HashSetTest {

	public static void main(String[] args) {
		HashSet hs= new HashSet();
		hs.add(new Person("lisi4",24));
		hs.add(new Person("lisi7",27));
		hs.add(new Person("lisi7",27));
		hs.add(new Person("lisi1",21));
		hs.add(new Person("lisi9",29));
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			Person p = (Person)it.next();
			System.out.println(p.getName()+"---"+p.getAge());
		}
	}
}