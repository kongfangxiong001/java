class SwitchTest2
{
	public static void main(String[] args)
	{
		int week = 1;
		switch(week=5)
		{
			case 1:
				System.out.println(week+"1");
				break;
			case 2:
				System.out.println(week+"2");
				break;
			default:
				System.out.println(week+"none");
		}

		System.out.println("Hello World!");
	}
}