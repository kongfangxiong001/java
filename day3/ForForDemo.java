class ForForDemo
{
	//大圈套小圈思想 a种情况重复一次，对应另外一种情况多次
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