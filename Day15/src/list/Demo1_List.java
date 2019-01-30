package list;
import java.util.*;

public class Demo1_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		Object obj = list.get(1);
		System.out.println(list.get(2));
		System.out.println(obj);
		list.set(1, "Geralt");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		

	}

	/**
	 * @param list
	 */
	private static void demo2(List list) {
		list.add(111);
		list.add(222);
		list.add(333);
	}

	/**
	 * 
	 */
	private static void demo1() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list);
		list.add(1, "g");
		System.out.println(list);
		list.add(5, "geralt");
		System.out.println(list);// index <= size
		Object obj = list.remove(1);
		System.out.println(obj);
		System.out.println(list);
	}

}
