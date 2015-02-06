class SwitchTest1
{
	public static void main(String[] args)
	{
		int x = 3;
		switch(x)  //byte,short,int,char
		{
			default:
				System.out.println("x");
				//break;
			case 4:
				System.out.println("a");
				//break;
			case 5:
				System.out.println("b");
				//break;
			case 6:
				System.out.println("c");
				break;
			case 7:
				System.out.println("d");
				break;
			
		}

		System.out.println("Hello World!");
	}
}