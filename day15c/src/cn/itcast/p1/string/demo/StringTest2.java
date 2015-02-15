package cn.itcast.p1.string.demo;


/*
 * 2,һ���ִ����������г��ֵĴ�����
 * ��nbaernbatynbauinbaopnba��
 * ˼·��
 * ��ҪindexOf,��������ѭ��
 * 1��ʹ��indexOf�����Ӵ���������++
 * 2��ʹ��indexOf���ϴγ��ֵ�λ�ò��ң�������++��
 * 3��indexOf ����Ϊ��������ѭ��2���������-1���������
 */
public class StringTest2 {

	public static void main(String[] args) {
		String s = "nbaernbatynbauinbaopnba";
		String sub_str = "nba";
		int count = subStringCount(s,sub_str);
		System.out.println(count);
	}

	private static int subStringCount(String s, String sub_str) {
		int pos = s.indexOf(sub_str);
		int count = 0;
		while(pos!=-1){
			pos = s.indexOf(sub_str,pos+sub_str.length());
			count++;
		}
		return count;
	}

}