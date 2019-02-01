package set;

import java.util.HashSet;
/*
 * set集合无索引，不可以重复，无序（存取不一致）
 * hash code 执行了，equals方法也执行了
 */

import bean.Person;

public class Demo1_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("Geralt",21));
		hs.add(new Person("Yennefer",22));
		hs.add(new Person("Yennefer",22));
		hs.add(new Person("Ciri",23));
		hs.add(new Person("Triss",24));
		hs.add(new Person("DandiLion",25));
		
		System.out.println(hs.size());
		System.out.println(hs);

	}

	/**
	 * 
	 */
	private static void demo1() {
		HashSet<String> hs = new HashSet<>();
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		hs.add("e");
		
		System.out.println(hs);
		System.out.println(b1);
		System.out.println(b2);
		
		for(String i : hs) {
			System.out.println(i);
		}
	}

}
