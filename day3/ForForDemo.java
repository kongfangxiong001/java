class ForForDemo
{
	//��Ȧ��СȦ˼�� a������ظ�һ�Σ���Ӧ����һ��������
	public static void main(String[] args)
	{
		int y=0;
		for(int x=0; x<3; x++)
		{
			for(; y<4; y++)
			{
				System.out.println("ok");
			}
			System.out.println("y="+y+",x="+x);
		}
		System.out.println("finally y="+y);
	}
}