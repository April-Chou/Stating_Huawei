package set;

import java.util.TreeSet;

import bean.Person;
/*
 * TreeSet集合是用来对元素进行排序的，同样也可以保证元素的唯一。
 * dang 当compare to返回0的时候，集合中只有一个元素
 * dang 当compare to返回正数的时候，集合中怎么存就怎么取
 * dang 当compare to返回负数的时候，集合会倒叙存储
 * er 二叉树，小的存储在左边（负数），大的存储在右边（正数），相等就不存（0）-----compareTo
 * 
 */

public class Demo3_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("Geralt",23));
		ts.add(new Person("Yennefer",22));
		ts.add(new Person("Ciri",23));
		
		System.out.println(ts);
		
		

	}

	/**
	 * 
	 */
	private static void demo1() {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(2);
		ts.add(1);
		
		System.out.println(ts);
	}

}
