package cn.itcast.p1.string.demo;

public class StringMethodDemo {

	public static void main(String[] args) {
		/*
		 * ������������˼��Ķ��ַ������ܷ��ࡣ
		 * "abcd"
		 * gb2312 nk
		 * gbk 2w
		 * gb18030
		 * unicode
		 * 
		 */
		stringMethodDemo_7();
	}

	private static void stringMethodDemo_7() {
		System.out.println("a".compareTo("Ab"));
	}

	private static void stringMethodDemo_6() {
		System.out.println("  abc  ");
		String s = "abc";
		System.out.println(s.equalsIgnoreCase("ABC"));
		System.out.println("abc".contains("bc"));
		System.out.println("abc".startsWith("Array"));
		System.out.println("abc".endsWith(".java"));
	}

	private static void stringMethodDemo_5() {
		String s = "java";
		s = s.replace('j', 'o');
		System.out.println(s);
	}

	private static void stringMethodDemo_4() {
		String s = "abcdef";
		s = s.toUpperCase();
		s = s.toLowerCase();
		System.out.println(s);
	}

	private static void stringMethodDemo_3() {
		String s = "ab��";
		byte[] b = s.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	private static void stringMethodDemo_2() {
		String s = "zhangsan. ����.����";
		String[] arr = s.split("\\.");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
			
	}

	private static void stringMethodDemo_1() {
		String s = "abcdefg";
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}