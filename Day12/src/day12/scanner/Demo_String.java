package day12.scanner;

public class Demo_String {
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1);   // da 打印了一个空数组
		
		byte[] arr1 = {97,98,99};  //GBK码表
		
		String s2 = new String(arr1);
		System.out.println(s2);  //print出 GBK码表。通过平台默认的字符集解码指定的byte数组，构造一个新的String
		
		byte [] arr2 = {97,98,99,100,101,102};
		String s3 = new String(arr2,2,3); //d 第一个index 2 表示从2 开始，3表示转3个
		System.out.println(s3);
		
		char [] arr3 = {'a','b','c','d','e'};
		String s4 = new String(arr3);
		System.out.println(s4);    //jiang 将字符数组转换成字符串
		
		String s5 = new String(arr3,1,3); //zhi 指定位置开始转换多少个
		System.out.println(s5);
		
		
	}

}
