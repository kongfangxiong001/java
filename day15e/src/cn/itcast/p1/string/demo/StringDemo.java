package cn.itcast.p1.string.demo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		/*
		 * String����ص�
		 */
		stringDemo2();
	}

	private static void stringDemo2() {
		// TODO Auto-generated method stub
		String s = "abc";
		String s1 = new String("abc");
		System.out.println(s==s1); //false
	}

	/**
	 * ��ʾ�ַ�������ĵ�һ�ַ�ʽ������ȷ�ַ��������ص��ص�
	 */
	private static void stringDemo1() {
		String s = "abc";
		s = "nba";
		System.out.println("s="+s);
	}

}