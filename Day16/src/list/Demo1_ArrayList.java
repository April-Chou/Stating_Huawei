package list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("a");
		list.add("ab");
		list.add("ac");
		list.add("c");
		list.add("d");
		list.add("c");
		
		System.out.println(list);
		ArrayList single = singleArray(list);
		System.out.println(single);

	}
	
	public static ArrayList singleArray(ArrayList list) {
		ArrayList newlist = new ArrayList();
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			if(!newlist.contains(obj)) {
				newlist.add(obj);
			}
		}
		
		
		return newlist;
	}

}
