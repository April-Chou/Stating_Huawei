package collection;

import java.util.ArrayList;
import java.util.Collection;
/*
 * add 方法如果是List集合一直返回true，因为list可以存储重复元素，如果set方法重复元素，则返回false
 * ArrayList的父类重写了toString方法，所以在打印对象的引用的时候，输出结果不是Object的toString方法
 */

import bean.Student;

public class Demo2_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		boolean b1 = c.add("abc");
		boolean b2 = c.add(1234);
		boolean b3 = c.add("abc");
		boolean b4 = c.add(new Student("Triss",23));
		c.remove("abc");
		c.remove("abc");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println(c);
		System.out.println(c.contains("abc"));
		System.out.println(c.size());

	}

}
