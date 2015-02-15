package cn.itcast.p2.stringbuffer.demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		/*
		 * StringBuffer：字符串缓冲区。
		 * 用于存储数据的容器。
		 * 特点：
		 * 1、可变长度
		 * 2、定以后，可以存不同类型数据进来。
		 * 3、长度16的数组
		 * 
		 * 既然是容器对象，应该具有什么功能？
		 * 1、添加
		 *  	append(data);
		 *  	insert(index,data);
		 * 2、删除
		 * 		delete(start,end);
		 * 		deleteCharAt(int index);
		 * 3、查找
		 * 		char charAt(index);
		 * 		int	 indexOf(string);
		 * 		int  lastIndexOf(string);
		 * 4、修改
		 * 		StringBuffer replace(start,end,string);
		 * 		setCharAt(index,char);
		 * 
		 * stringBuffer 线程安全
		 * stringBuilder 线程不安全， jdk1.5以后
		 * 
		 * jdk升级：
		 * 1、简化书写
		 * 2、提高效率
		 * 3、增加安全性
		 * 
		 */
		bufferMethodDemo();
	}

	private static void bufferMethodDemo() {
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append(12);
		sb.append(true);
		System.out.println(sb.toString());
	}

}
