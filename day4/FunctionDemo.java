class FunctionDemo
{
	public static void main(String [] args)
	{
		int c = add(3,4);
		System.out.println("c="+c);
	}
	//���庯���ĸ�ʽ
	/*
	���������
	����û�з���ֵ��

	return ���ֱ�ӣ����档
	��������Ϊvoid�������е�return������ʡ�Բ�д������дϵͳ����ϡ�


	�����ڿ��Ե��ú������������ں����ж��庯��

	System.out.println(add(3,5)); //�������void
	*/
	public	static int add(int a,int b)
	{
		return a+b;
	}
}