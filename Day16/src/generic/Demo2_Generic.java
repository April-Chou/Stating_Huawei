package generic;
import java.util.*;

import bean.Person;
public class Demo2_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("Geralt",23));
		list.add(new Person("Yennefer",24));
		list.add(new Person("Ciri",25));
		list.add(new Person("Triss",26));
		
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName() + "......" + p.getAge());
		}
		

	}

	/**
	 * 
	 */
	private static void demo1() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator<String> it = list.iterator();//collection是什么泛型，迭代器就是什么泛型就可以了
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
