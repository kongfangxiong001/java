class FunctionOverride
{
	/**
	1、同一个类
	2、同名
	3、参数个数不同，or 参数类型不同
	*/

	//加法运算，两个整数的和
	public static int add(int a,int b)
	{
		return a+b;
	}
	//加法运算，两个小数的和
	public static double add(double a,double b)
	{
		return a+b;
	}

	//加法运算，三个整数的和
	public static int add(int a,int b, int c)
	{
		return a+b+c;
	}

	public static void main(String [] args)
	{
		add(4,6);
		add(4.5,6.5);
		add(3,4,5);
	}
}