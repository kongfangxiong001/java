package cn.itcast.p2.wrapper.demo;

public class WrapperDemo2 {

	public static void main(String[] args) {
		int num = 4;
		num = num+5;
		
		Integer i = 4; // Integer i = new Integer(4);自动装箱，简化书写
		i = i+6;//自动拆箱  自动将对象转化成基本数据类型   null + 6 异常，健壮判断。
		
//		show();
		
		
		//自动拆箱装箱
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		Integer x = 128;//jdk1.5以后，自动装箱，如果装箱的是一个字节，那么该数据会被共享，不会重新开辟空间
		Integer y = 128;//127
		System.out.println(x==y);
		System.out.println(x.equals(y));
	}

	private static void show() {
		
	}

}
