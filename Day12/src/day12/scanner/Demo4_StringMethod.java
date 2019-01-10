package day12.scanner;
/*
 * boolean equals ()比较字符串内容是否相同，区分大小写
 * boolean contains()判断大字符串中是否包含小字符串
 * boolean startsWith()判断是否以某个字符串开头
 * boolean endsWith()判断是否以某个字符串结尾
 * boolean isEmpty()判断字符串是否为空
 * "" 和null的区别，空串是一个字符串常量，同时也是一个String类对象，既然是对象当然可以调用String类方法
 * null是空常量，不能调用任何方法，否则会出现空指针异常，null常量可以给任意的引用数据类型赋值
 */
public class Demo4_StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "xiao guo jiejie";
		String s2 = "xiao guo";
		String s3 = "xi";
		String s4 = "ie";
		
		System.out.println(s1.contains(s2));
		
		System.out.println(s1.startsWith(s3));
		
		System.out.println(s1.endsWith(s4));
		
		System.out.println(s1.isEmpty());

	}

}
