package jdk5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ###16.18_ z 集合框架(Arrays工具类的asList()方法的使用)(掌握)
 * 
 * s 数组转集合虽然不能增加或减少元素，但可以用集合的思想操作数组。可以使用集合中的其他方法。不能添加,减少也不行
* A:案例演示
	* Arrays工具类的asList()方法的使用
	* Collection中toArray(T[] a)泛型版的集合转数组
 */
public class Demo4_AsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		
//		demo2();
		/*
		 * ji 集合转数组，加泛型的
		 */
		ArrayList <String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		String [] arr = list.toArray(new String[0]);//dang 当集合转换数组时，数组长度小于等于集合size时，转换后数组长度等于集合的size
//		ru 如果数组长度大于size，分配的数组长度就和指定的长度一样。
		for(String i : arr) {
			System.out.println(i);
		}
		
		

	}

	/**
	 * 
	 */
	private static void demo2() {
		/*
		 * ji 基本数据类型的数组转换成集合会将整个数组当做一个对象去转换
		 * jiang 将数组转换成集合，数组必须是引用数据类型
		 */
		Integer [] arr = {11,22,33,44,55};
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
	}

	/**
	 * 
	 */
	private static void demo1() {
		String [] arr = {"a", "b", "c"};
		List<String> list = new ArrayList<>();
		list = Arrays.asList(arr);
		System.out.println(list);
//		list.remove(1);
//		System.out.println(list);
	}

}
