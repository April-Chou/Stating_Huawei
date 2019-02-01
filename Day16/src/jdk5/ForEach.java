package jdk5;

import java.util.ArrayList;

import bean.Person;

/*
 * ###16.13_ z集合框架(增强for的概述和使用)(掌握)
* A:增强for概述
	* 简化数组和Collection集合的遍历
* B:格式：
* 
		for(元素数据类型 变量 : 数组或者Collection集合) {
			使用变量即可，该变量就是元素
		}
* C:案例演示
	* 数组，集合存储元素用增强for遍历
* D:好处
	* 简化遍历
 */
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		//demo2();
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
//		bing 并发修改异常，不能用集合的删除方法，增强for循环底层依赖迭代器，增强for，以及迭代器都不能删除。只能遍历
//		for(String i : list) {
//			System.out.println(list.remove(i));
//		}

	}

	/**
	 * 
	 */
	private static void demo2() {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("Yennefer",234));
		list.add(new Person("Geralt",234));
		list.add(new Person("Yennefer",234));
		list.add(new Person("Ciri",234));
		
		for(Person i : list) {
			System.out.println(i);
		}
	}

	/**
	 * 
	 */
	private static void demo1() {
		int[] arr = {11,22,33,44,55,66};
		for(int i : arr) {
			System.out.println(i); //bu 不是arr[i]
		}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		for(String i : list) {  //z 注意是后面的类型
			System.out.println(i);
		}
	}

}
