package collection;
import java.util.*;

import bean.Student;
public class Demo5_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		Collection c = new ArrayList();
		c.add(new Student("Geralt",22));
		c.add(new Student("Yennefer",23));
		c.add(new Student("Triss",24));
		c.add(new Student("Cire",25));
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			Student s = (Student) it.next();
			System.out.println(s.getAge() + "....." + s.getName());
		}


	}

	/**
	 * 
	 */
	private static void demo1() {
		Collection c = new ArrayList();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
