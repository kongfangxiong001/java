package cn.itcast.p1.string.demo;

public class StringContructorDemo {

	public static void main(String[] args) {
		stringContructorDemo2();
	}

	private static void stringContructorDemo2() {
		char[] arr = {'w','a','p','q'};
		String s = new String(arr);
		System.out.println("s="+s);
	}

	private static void stringContructorDemo() {
		String s = new String();//��Ч��String = ""; ����Ч String s = null;
		byte[] arr = {67,68,69}; //127����
		String  s1 = new String(arr);
		System.out.println("s1="+s1);
	}
	
}