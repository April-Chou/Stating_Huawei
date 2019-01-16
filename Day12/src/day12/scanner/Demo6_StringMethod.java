package day12.scanner;

public class Demo6_StringMethod {
	public static void main(String[] args) {
		//demo1();
		
		//demo2();
		
		/*
		 * value of 将任意基本数据类型的字符数组转换为字符串
		 */
		
		char arr [] = {'a', 'b', 'c', 'd'};
		
		String s = String.valueOf(arr);// jing 静态方法，类名调用
		System.out.println(s);
		
		
	}

	private static void demo2() {    //zi 字符串转换为字符数组
		String s = "Geralt of Rivia";
		char [] arr = s.toCharArray();
		System.out.println(arr);
		System.out.println(s);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void demo1() {
		String s = "abc";
		byte [] arr = s.getBytes();
		
		for(int i=0;i<arr.length;i++) {  //bianma 编码，把我们看的懂的转换为计算机看得懂的。 gBK码表，，一个中文代表两个字节，中文的第一个字节肯定为负数（GBK码表特点）
			System.out.print(arr[i] + " ");
		}
	}

}
