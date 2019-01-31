package list;
import java.util.*;
/*
 * 栈先： 进后出，
 * 队列： 先进先出
 */
public class Demo3_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addFirst("a");
		list.addFirst("b");
		list.addFirst("c");
		list.addFirst("d");
		
		System.out.println(list);
		
		list.addLast("e");
		list.addLast("f");
		list.addLast("g");
		list.addLast("h");
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.removeFirst());
		System.out.println(list);
		System.out.println(list.removeLast());
		System.out.println(list);
		System.out.println(list.indexOf("e"));
		System.out.println(list.get(2));

	}

}
