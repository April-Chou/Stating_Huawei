package day12.scanner;

public class Demo3_String_Question {

	public static void main(String[] args) {
//		demo1();
		
		
/*
 * Question 2 下面这句话创建了几个对象
 */
//		String s1 = new String("abc");//chang 常量池创建一个，堆内存一个副本，两个对象
		
//		demo2();
		
		
//		demo3();
		
		demo4();
	}



	private static void demo4() {
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1+ "c";
		
		System.out.println(s3 == s2);  //false
		System.out.println(s3.equals(s2)); //true
	}
	
	

/*
 * Question 4: 是否相等
 */
	private static void demo3() {
		String s1 = "a" + "b" + "c";// java中有常量优化机制
		String s2 = "abc";//
		
		System.out.println(s1 == s2);  //true
		System.out.println(s1.equals(s2)); //true
	}




	/*
	 * Question 3
	 * s1 与s2是否相等,不相等，因为一个是常量池地址值一个是堆内存地址值
	 */
	private static void demo2() {
		String s1 = new String("abc");//jilu堆内存地址值
		String s2 = "abc";//jilu常量池地址值
		
		System.out.println(s1 == s2);  
		System.out.println(s1.equals(s2));
	}

	
	/*
	 * Question 1, following true or false
	 */
	private static void demo1() {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "abc";
		
		/*
		 * Question 1, following true or false
		 * alt + shift + M 抽取方法
		 * 
		 */

		System.out.println(s1 == s2);    //true == hao 比较的是地址值，abc开始如果没有的话在常量池创建，有的话就不创建了，两个引用指向同一个对象，地址值是一样的
		System.out.println(s1.equals(s2));//dang 当且仅当该参数不为null，并且是与此对象表示相同序列的String对象时，结果才为true
	}

}
