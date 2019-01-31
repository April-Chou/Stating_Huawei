package list;
import java.util.*;
/*
 * dui 对此进行了封装
 */
public class Stack {
	private LinkedList list = new LinkedList();
	//mo ni jinzhan
	public void in(Object obj) {
		list.addLast(obj);
	}
	//moni chu zhan
	public Object out() {
		return list.removeLast();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.in("a");
		s.in("b");
		s.in("c");
		s.in("d");
		s.in("e");
		
		System.out.println(s);
		
		while(!s.isEmpty()) {
			System.out.println(s.out());
		}
		
		

	}

}
