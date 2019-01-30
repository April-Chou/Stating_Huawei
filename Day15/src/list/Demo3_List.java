package list;
import java.util.*;
/*
 * 并发修改异常，遍历的同时在增加元素
 */

public class Demo3_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li = new ArrayList();
		li.add("a");
		li.add("b");
		li.add("world");
		li.add("c");
		li.add("d");
		li.add("e");
		
//		Iterator it = li.iterator();
//		while(it.hasNext()) {
//			String str = (String)it.next();
//			if(str == ("world")) {
//				li.add(li.size(),"javaee");
//			}
//		}
//		System.out.println(li);
		
		ListIterator lit = li.listIterator();//list集合特有的 listIterator
		while(lit.hasNext()) {
			String str = (String)lit.next();
			if(str == ("world")) {
				lit.add("javaee");
		    }
	   }
		System.out.println(li);

	}

}
