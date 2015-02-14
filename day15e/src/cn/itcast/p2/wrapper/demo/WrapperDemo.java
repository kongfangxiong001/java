package cn.itcast.p2.wrapper.demo;
import java.nio.ByteOrder;

public class WrapperDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * �����������Ͱ�װ��
		 * 8����װ��
		 * byte			Byte
		 * short		Short
		 * int			Integer
		 * long			Long
		 * double		Double
		 * char			Character
		 * boolean		Boolean
		 */
		
		int num;
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.toBinaryString(-6));
		
		int num2 = 4;
		Integer i = new Integer(num2);
		/*
		 * string.vauleof 
		 * xx + ""
		 */
		
		/*
		 * ��������--->�ַ���
		 * 		1������������ֵ+""
		 * 		2����String���valueOf����
		 * 
		 * 		3,Integer.valueOf(1234);
		 * �ַ���---->��������
		 * 		1��ʹ�ð�װ���еľ�̬������xxx parseXxx   ******
		 * 			�磺Integer.parseInt("1234");
		 * 			   Boolean.parseBoolean(true);
		 *		2,����ַ�����Integer�����˶���ķ�װ  ֻ��int��
		 *				����ʹ����һ���Ǿ�̬�ķ�����intValue();
		 *				Integer num = new Integer("123");
		 *				int num2 = num.intValue(); //ת������
		 *		
		 */
		try{
			System.out.println(Integer.parseInt("1234a"));
		}catch(NumberFormatException e){
			System.out.println(e.getMessage());
		}
		System.out.println(String.valueOf(1234));
		
		
		/*
		 * �����߱���ͬ���Ƶ�����
		 * ʮ����--->��������
		 * ��������---->ʮ����
		 */
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toHexString(60));
		System.out.println(Integer.toOctalString(60));
		
		
		System.out.println(Integer.toString(60,8));
		
		/*
		 * ��������תʮ����
		 */
		//Integer.parseInt(String s, int radix);
		System.out.println(Integer.parseInt("110",2));//��110����2���ƽ���ת��
		
		
		
		Integer a = new Integer("3");
		Integer b = new Integer(3);
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		System.out.println(a.compareTo(b));
		
		String s1 = new String("b");
		String s2 = new String("f");
		System.out.println(s2.compareTo(s1));
		
		
	}

}