package cn.itcast.p2.wrapper.demo;

public class WrapperDemo2 {

	public static void main(String[] args) {
		int num = 4;
		num = num+5;
		
		Integer i = 4; // Integer i = new Integer(4);�Զ�װ�䣬����д
		i = i+6;//�Զ�����  �Զ�������ת���ɻ�����������   null + 6 �쳣����׳�жϡ�
		
//		show();
		
		
		//�Զ�����װ��
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		Integer x = 128;//jdk1.5�Ժ��Զ�װ�䣬���װ�����һ���ֽڣ���ô�����ݻᱻ�����������¿��ٿռ�
		Integer y = 128;//127
		System.out.println(x==y);
		System.out.println(x.equals(y));
	}

	private static void show() {
		
	}

}
