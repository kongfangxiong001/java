package cn.itcast.p1.string.demo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		/*
		 * String类的特点
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
	 * 演示字符串定义的第一种方式，并明确字符创常量池的特点
	 */
	private static void stringDemo1() {
		String s = "abc";
		s = "nba";
		System.out.println("s="+s);
	}

}