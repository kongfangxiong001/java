class ForDemo
{
	public static void main(String[] args)
	{
		for(int x=1;x<3;System.out.println("c")) //����
		{
			System.out.println("c");
			x++;
		}


/*
	For��While���ص㣺
	1��for��while���Ի�����
	2��for��while��ʽ�ϲ�ͬ����ʹ�����е�С����
		�����Ҫͨ����������ѭ�����п��ƣ��ñ���ֻ��Ϊѭ����������ʱ��
	3.�õ���Ҫ���ƴ�����ʱ��while
	for(;;){} Ĭ��true
	
	//��ӡ1~10ʮ������
	int x = 1;
	while(x<5)
	{
		System.out.println("x="+x);
		x++;
	}
	
	for(int y=1;y<5;y++)
	{
		System.out.println("y="+y);
	}
	
*/

/*
ʹ�ó��������ѭ��ʱ��
����һ������һ���жϣ���if
����ж�ʱ����while��

ע�⣺
	��Ҫ�ж���Щ�����Ҫѭ������Щ��Ҫ��

	�������������ƴ�����
*/


		int x = 1;
		while(x<5)
		{
			System.out.println("x="+x);
			x++;
		}
		System.out.println(x);

		for(int y=1;y<5;y++) //���Լ���������������
		{
			System.out.println("y="+y);
		}
		//System.out.println(y);
	}
}