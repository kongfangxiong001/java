class BreakContinue
{
	public static void main(String[] args)
	{
		/*
		break : ������
		break : Ҫô����switch����У�Ҫô����ѭ���С�
		ע�⣺��break����ʹ��ʱ�����治Ҫ������䣬��Ϊִ�в�����

			break�������ڵ�ǰѭ����
			���������ѭ��Ƕ�ף����š�
		*/
		xiaoqiang:for(int x=0; x<3 ;x++)
		{
			wangcai:for(int y=0;y<4;y++)
			{
				System.out.println("x="+x);
				break xiaoqiang;
			}
		}
		System.out.println("finally y="+y);



		/**
		continue:����ѭ��
		���÷�Χ��ѭ���ṹ����������ѭ���������´�ѭ��
		*/
	}
}