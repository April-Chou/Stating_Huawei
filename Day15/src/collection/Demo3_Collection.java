package collection;

import java.util.ArrayList;
import java.util.Collection;

import bean.Student;

public class Demo3_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
//		c.add("a");
//		c.add("b");
//		c.add("c");
//		c.add("d");
		c.add(new Student("Yennefer",23));
		
		Object[] arr = c.toArray();
		for(int i=0; i<arr.length; i++) {
			//System.out.println(arr[i]);
			Student s= (Student)arr[i];
			System.out.println(s.getName()+s.getAge());
		}

	}

}
