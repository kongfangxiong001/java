package cn.itcast.p1.string.demo;

/*
 * �����ַ��������ͬ���Ӵ�
 * ˼·��
 * 	1���ҳ������ַ����е���̵ġ�
 * 	2����̵Ķ̴����� ������ �����ڳ������Ƿ���������� break������ѭ����
 * 	3��������̵�����Ϊ0��û���ҵ������ء�����
 */
public class StringTest3 {

	public static void main(String[] args) {
		String str = "A1234";
		String str2 = "123456";
		String sub_str = getLongSubStr(str, str2);
		System.out.println(sub_str);

	}

	public static String getLongSubStr(String str, String str2) {

		for (int i = 0, l = str.length(); i < l; i++) { // �ִ��ĳ���Ϊ str.length-i
			for (int j = 0; j <= i; j++) {
				String substr = str.substring(j, l - i + j);
				if (str2.contains(substr)) {
					return substr;
				}
			}
		}
		return "";
	}

}