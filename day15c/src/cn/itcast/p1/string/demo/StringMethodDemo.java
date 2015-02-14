package cn.itcast.p1.string.demo;

public class StringMethodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 1����ȡ
		 * ��ȡ����
		 *  int length();
		 * ����λ�û�ȡ�ַ�
		 * 	char charAt(int index);
		 * ��ȡ��һ��/���һ�γ��ֵ�λ��
		 *  int indexOf(int ch);
		 * ��ȡ�ַ����е�һ�����ַ���
		 *  String substring(int beginIndex,int endIndex);//����from������end
		 *  2��ת��
		 *  	1��ת������
		 *  		String[] split(String regex);
		 *  	2���ַ�������ַ�����
		 *  		Char[] toCharArray()
		 *  	3���ַ���ת��byte[]
		 *  		byte[] getBytes();
		 *  	4�����ַ���ת����Сд
		 *  		String toUpperCase();��д
		 *  		String toLowwerCase();
		 *  	5�����ַ����е�ָ�����ݽ����滻
		 *  		String repleace(char oldch,char newch);
		 *  	6��trim
		 *  	7�����ַ�������
		 *  		String concat(string); //"ab"+"kk"
		 *  	8��
		 *  		valueOf
		 *  3��
		 *  	1�������ַ��������Ƿ���ͬ��
		 *  		boolean equals(Object obj);
		 *  		boolean equalsIgnoreCase(String str);
		 *  	2���ַ������Ƿ����Ī���ַ���
		 *  		boolean contains(String str);
		 *  	3�� �ַ����Ƿ���ָ���ַ�����ͷ/��β
		 *  		boolean startsWith(string)
		 *  		boolean endsWith(string);
		 *  		contains
		 *  	4���Ƚ�
		 *  		int compareTo(String anotherString);
		 *  		
		 */
		StringMethodDemo_3();
	}

	private static void StringMethodDemo_3() {
		String s = "abc";
		System.out.println(s.equalsIgnoreCase("ABC"));
		System.out.println("abc".contains("ab")); //indexOf
		String str = "ArrayDemo.java";
		System.out.println(str.startsWith("Array"));
		System.out.println(str.endsWith(".java"));
		System.out.println(str.contains("Demo"));
		System.out.println(str.compareTo("ArrayDemo.jav"));
	}

	private static void StringMethodDemo_2() {
		String s = "����.����.����";
		String [] arr = s.split("\\.");
		
		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}
		s = "ab��";
		byte[] bytes = s.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		
		System.out.println("Abc".toUpperCase());
		
		System.out.println("java".replace("ja","aj"));
	}

	private static void StringMethodDemo_1() {
		String s = "abcdef";
		System.out.println("index:"+s.indexOf("k"));//�ж�λ�û����
		System.out.println("substring:"+s.substring(1, 3));
	}
}