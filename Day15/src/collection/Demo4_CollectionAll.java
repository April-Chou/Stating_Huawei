package collection;
import java.util.*;
public class Demo4_CollectionAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		//demo1(c1, c2);
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		c1.add("e");
		
		c2.add("a");
		c2.add("b");//删除的是交集
		c2.add("z");
		
		boolean b = c1.removeAll(c2);
		System.out.println(b);
		System.out.println(c1);
		boolean b1 = c1.containsAll(c2);//重复没事，但是不能有不一样的
		System.out.println(b1);
		
		boolean b2 = c1.retainAll(c2);//取交集
		System.out.println(b2);
		System.out.println(c1);

	}

	/**
	 * @param c1
	 * @param c2
	 */
	private static void demo1(Collection c1, Collection c2) {
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		c1.add("e");
		
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		c2.add("e");
		
		c1.addAll(c2);
		System.out.println(c1);
	}

}
