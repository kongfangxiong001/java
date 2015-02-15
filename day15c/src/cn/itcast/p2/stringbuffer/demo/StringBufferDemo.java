package cn.itcast.p2.stringbuffer.demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		/*
		 * StringBuffer���ַ�����������
		 * ���ڴ洢���ݵ�������
		 * �ص㣺
		 * 1���ɱ䳤��
		 * 2�����Ժ󣬿��Դ治ͬ�������ݽ�����
		 * 3������16������
		 * 
		 * ��Ȼ����������Ӧ�þ���ʲô���ܣ�
		 * 1������
		 *  	append(data);
		 *  	insert(index,data);
		 * 2��ɾ��
		 * 		delete(start,end);
		 * 		deleteCharAt(int index);
		 * 3������
		 * 		char charAt(index);
		 * 		int	 indexOf(string);
		 * 		int  lastIndexOf(string);
		 * 4���޸�
		 * 		StringBuffer replace(start,end,string);
		 * 		setCharAt(index,char);
		 * 
		 * stringBuffer �̰߳�ȫ
		 * stringBuilder �̲߳���ȫ�� jdk1.5�Ժ�
		 * 
		 * jdk������
		 * 1������д
		 * 2�����Ч��
		 * 3�����Ӱ�ȫ��
		 * 
		 */
		bufferMethodDemo();
	}

	private static void bufferMethodDemo() {
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append(12);
		sb.append(true);
		System.out.println(sb.toString());
	}

}