package list;
import java.util.*;
public class Demo4_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addLast("a");
		list.addLast("b");
		list.addLast("c");
		list.addLast("d");
		list.addLast("e");
		list.addLast("f");
		
		while(!list.isEmpty()) {
			System.out.println(list.removeLast());
		}
		

	}

}
