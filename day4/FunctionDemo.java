class FunctionDemo
{
	public static void main(String [] args)
	{
		int c = add(3,4);
		System.out.println("c="+c);
	}
	//定义函数的格式
	/*
	特殊情况：
	函数没有返回值。

	return 语句直接；代替。
	返回类型为void。函数中的return语句可以省略不写。【不写系统会加上】


	函数内可以调用函数，不可以在函数中定义函数

	System.out.println(add(3,5)); //不能输出void
	*/
	public	static int add(int a,int b)
	{
		return a+b;
	}
}