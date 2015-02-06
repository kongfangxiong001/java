class SwitchTest
{
	public static void main(String[] args)
	{
		int week = 1;
		switch(week)
		{
			case 1:
				System.out.println(week+"对应的是星期一");
				break;
		}
	}
}
/*
if:
1.对具体值进行判断
2.对区间判断
3.对运算结果是boolean类型的表达式进行判断
*/

/*
switch:
1.对具体的值进行判断。值的个数通常是固定的。

对于几个固定的值的判断，建议使用switch语句，因为switch语句会将具体的答案加载进内存，效率高
*/