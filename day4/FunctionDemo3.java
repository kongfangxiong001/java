class FunctionDemo3
{
	public static void main(String [] args)
	{
		System.out.println(equals(1,2));
	}
	/*
	定义函数两个明确：
	1、这个功能的结果是什么？返回类型
	2、这个功能是否需要位置的内容参与运算？明确参数
	*/

	public static boolean equals(int a,int b)
	{
		if(a==b) return true;
		return false;
	}
}