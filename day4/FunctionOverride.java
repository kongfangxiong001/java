class FunctionOverride
{
	/**
	1��ͬһ����
	2��ͬ��
	3������������ͬ��or �������Ͳ�ͬ
	*/

	//�ӷ����㣬���������ĺ�
	public static int add(int a,int b)
	{
		return a+b;
	}
	//�ӷ����㣬����С���ĺ�
	public static double add(double a,double b)
	{
		return a+b;
	}

	//�ӷ����㣬���������ĺ�
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