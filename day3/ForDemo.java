class ForDemo
{
	public static void main(String[] args)
	{
		for(int x=1;x<3;System.out.println("c")) //错误
		{
			System.out.println("c");
			x++;
		}


/*
	For和While的特点：
	1，for和while可以互换。
	2，for和while格式上不同，再使用上有点小区别。
		如果需要通过变量来对循环进行控制，该变量只作为循环增量存在时。
	3.用到不要控制次数的时候，while
	for(;;){} 默认true
	
	//打印1~10十个数字
	int x = 1;
	while(x<5)
	{
		System.out.println("x="+x);
		x++;
	}
	
	for(int y=1;y<5;y++)
	{
		System.out.println("y="+y);
	}
	
*/

/*
使用场景，多次循环时。
党对一个条件一次判断，用if
多次判断时，用while。

注意：
	需要判断哪些语句需要循环，哪些不要。

	定义条件，控制次数。
*/


		int x = 1;
		while(x<5)
		{
			System.out.println("x="+x);
			x++;
		}
		System.out.println(x);

		for(int y=1;y<5;y++) //有自己独立的作用区间
		{
			System.out.println("y="+y);
		}
		//System.out.println(y);
	}
}