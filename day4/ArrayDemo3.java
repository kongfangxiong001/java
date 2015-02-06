class ArrayDemo3
{
	public static void main(String [] args)
	{
		//int[] arr = new int[3]; //需要一个容器，但是不明确具体数据

		//格式2
		//int[] arr = new int[]{1,2,3,230,32};
		int[] arr = {89,23,432,231,3432,43,432,423,432,42,4,22};//静态初始化内容。需要一个容器存储已知的具体数据。

		/**
		对数据的操作就是存取。
		核心思想:就是对角标的操作。
		*/

		/**
			array.length属性，数组存储的元素的个数。
		*/
		for(int x=0;x<arr.length;x++)
		{
			System.out.println(arr[x]);
		}
		int i = 0;
		while(i<arr.length)
		{
			System.out.println(arr[i++]);
		}
	}  
}