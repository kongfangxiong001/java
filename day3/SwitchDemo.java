class SwitchDemo
{
	public static void main(String[] args)
	{
		/*
		switch(���ʽ)
		{
			case value1:
				run1;
				break;

			case value1:
				run1;
				break;

			case value1:
				run1;
				break;

			default:
				run3;
				break;
		}  ƥ�������ߣ������жϡ���ƥ�����ж�
		*/
		int x = 3;
		switch(x)  //byte,short,int,char
		{
			case 4:
				System.out.println("a");
				break;
			case 5:
				System.out.println("b");
				break;
			case 6:
				System.out.println("c");
				break;
			case 7:
				System.out.println("d");
				break;
			default:
				System.out.println("x");
		}

		System.out.println("Hello World!");
	}
}