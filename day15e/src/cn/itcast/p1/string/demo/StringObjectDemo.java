package cn.itcast.p1.string.demo;

public class StringObjectDemo {

	public static void main(String[] args) {
		// String s1 = "abc";
		// String s2 = "abc";
		String s1 = new String("abc");
		String s2 = s1.intern();

		System.out.println(s1 == s2);

	}
}
