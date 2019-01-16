package day12.scanner;
/*
 * int lentgh 获取字符串长度
 * char charAt(int index)获取指定索引的字符
 * int indexOf(int ch)返回指定字符再次字符串中第一次出现处的索引
 * 
 */

public class Demo5_StringMethod {
	public static void main(String [] args) {
		demo1();
		demo2();
		
		demo3();
		
		demo4();
		
		// mian shi question
		String s = "Geralt of Rivia";
		s.substring(5);
		System.out.println(s); //substring 会产生新的字符串，需要将新的字符串记录
	}

	private static void demo4() {
		String s1  = "Geralt of Rivia";
		String s2 = s1.substring(10);
		System.out.println(s2);    //cong 从指定位置开始截取字符，默认到结尾
		
		String s3 = s1.substring(0, 10);
		System.out.println(s3);// cong 指定位置开始，含头不包含尾，左闭右开
	}

	private static void demo3() {
		String s1 = "Yennefer of Venggenburger";
		int index = s1.indexOf("e", 2);
		System.out.println(index);//c 从指定位置开始向后找
		
		int index1 = s1.lastIndexOf("e");
		System.out.println(index1); //co 从后向前找，第一次出现的字符
		
		int index2 = s1.lastIndexOf("e", 23);
		System.out.println(index2);  //zhi 指定位置开始从后向前找
	}

	private static void demo2() {
		String s1 = "Geralt of Rivia";
		int index = s1.indexOf("r");
		System.out.println(index);
		
		int index1 = s1.indexOf("z");
		System.out.println(index1);//r 如果找不存在的，返回-1
		
		int index2 = s1.indexOf("of");
		System.out.println(index2);  //h 获取字符串中第一个出现的字符的位置
		
		int index3 = s1.indexOf("oi");
		System.out.println(index3);// b不是连着的出现-1
	}

	private static void demo1() {
		int [] arr = {11,22,33,44,55};
		System.out.println(arr.length);//数组中length是属性
		
		String s1 = "Guo Yennefer";
		System.out.println(s1.length());//length是方法，获取的是每一个字符的个数
		
		char c = s1.charAt(5);
		System.out.println(c);
		//char c1 = s1.charAt(100);   h 会出现字符串的索引越界异常
	}

}
