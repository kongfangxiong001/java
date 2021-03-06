package cn.itcast.p4.generic.define.demo;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 泛型：对操作类型进行指定。集合框架。
 * jdk1.5出现的安全机制。提高安全性。
 * 
 * 好处：
 * 	1、将运行时期的问题ClassCastException转到了编译时期。
 * 	2、避免了循环时，强制转换的麻烦。
 * 	
 * <>:什么时候使用？当操作的引用类型不确定时候。就可以使用<>。将要操作的引用类型传入即可。
 *  其实<>就是一个用于接收具体引用类型的参考范围。
 *  在程序，只要用到了带<>接口，类，就要明接收的引用的类型。
 *  
 *  用在编译时期的安全。，编译时期的技术。给编译器使用的技术。
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
		// al.add(4); //不能存
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}
}
