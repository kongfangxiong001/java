package cn.itcast.p2.wrapper.test;

import java.util.Arrays;

/*
 * �����ַ������͵Ķ���ֵ�����ɴ�С������
 * ��20 78 9 -7 88 36 29 0 1��
 * 
 * ˼·��
 * 1�������Һ��졣
 * 2��ͼ�ͻ�ȡ������ַ�������Ҫ�������ֵ
 * 3���и��С���ٱȽ�
 * �ַ�ת-->�������Ϳ����ð�װ��
 * 
 * 
 */
public class WrapperTest {
	private static final String SPACE_SEPARATOR = " ";

	public static void main(String[] args) {
		String numStr = "20 78 9    -7 88 36 29 0 1";
		System.out.println(numStr);
		numStr = sortStringNumber(numStr);
		System.out.println(numStr);
	}

	private static String sortStringNumber(String numStr) {
		String[] numStrArr = stringToArray(numStr);
		int[] numArr = toIntArray(numStrArr);
		mySortArray(numArr);
		String temp = arrayToString(numArr);
		return temp;

	}

	private static String arrayToString(int[] numArr) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numArr.length; i++) {
			if (i != numArr.length - 1) {
				sb.append(numArr[i] + SPACE_SEPARATOR);
			} else {
				sb.append(numArr[i]);
			}

		}
		return sb.toString();

	}

	private static void mySortArray(int[] numArr) {
		Arrays.sort(numArr);
	}

	private static int[] toIntArray(String[] numStrArr) {
		int[] arr = new int[numStrArr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(numStrArr[i]);
		}
		return arr;

	}

	/**
	 * @param numStr
	 * @return
	 */
	public static String[] stringToArray(String numStr) {
		String[] numStrArr = numStr.split(SPACE_SEPARATOR + "+");
		return numStrArr;
	}

}