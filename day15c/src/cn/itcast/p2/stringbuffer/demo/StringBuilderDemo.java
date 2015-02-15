package cn.itcast.p2.stringbuffer.demo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 521, 1 };
		String s = arrayToString(arr);
		System.out.println(s);
	}

	private static String arrayToString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1)
				sb.append(arr[i] + ",");
			else
				sb.append(arr[i] + "]");
		}
		return sb.toString();
	}

}
