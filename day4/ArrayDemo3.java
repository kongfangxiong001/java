class ArrayDemo3
{
	public static void main(String [] args)
	{
		//int[] arr = new int[3]; //��Ҫһ�����������ǲ���ȷ��������

		//��ʽ2
		//int[] arr = new int[]{1,2,3,230,32};
		int[] arr = {89,23,432,231,3432,43,432,423,432,42,4,22};//��̬��ʼ�����ݡ���Ҫһ�������洢��֪�ľ������ݡ�

		/**
		�����ݵĲ������Ǵ�ȡ��
		����˼��:���ǶԽǱ�Ĳ�����
		*/

		/**
			array.length���ԣ�����洢��Ԫ�صĸ�����
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