package cn.itcast.p1.string.demo;

public class StringDemo {

	public static void main(String[] args) {
		stringDemo1();
		stringDemo2();
	}

	private static void stringDemo2() {
		String s = "abc";  //���Թ���
		
		String s1 = new String(s);
		System.out.println("s="+s);
		System.out.println("s1="+s1);
		
		System.out.println(s==s1);
	}

	/**
	 * ��ʾ������
	 */
	public static void stringDemo1() {
		String s = "abc";
		String s1 = "abc";
		
		System.out.println(s==s1);
	}

}