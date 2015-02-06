class BreakContinue
{
	public static void main(String[] args)
	{
		/*
		break : 跳出；
		break : 要么用在switch语句中，要么用在循环中。
		注意：当break单独使用时，下面不要定义语句，因为执行不到。

			break跳出所在当前循环。
			如果出现了循环嵌套，则标号。
		*/
		xiaoqiang:for(int x=0; x<3 ;x++)
		{
			wangcai:for(int y=0;y<4;y++)
			{
				System.out.println("x="+x);
				break xiaoqiang;
			}
		}
		System.out.println("finally y="+y);



		/**
		continue:继续循环
		作用范围：循环结构，结束本次循环，继续下次循环
		*/
	}
}