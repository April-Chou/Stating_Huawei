package test;

import java.util.ArrayList;
import java.util.HashSet;


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * addall 大法好
		 * 
		 */
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("d");
		list.add("e");
		list.add("a");
		
		change(list);


		System.out.println(list);

	}
	
	public static HashSet change(ArrayList<String> list) {
		
		HashSet<String> hs = new HashSet<>();
		hs.addAll(list);
		list.clear();
		list.addAll(hs);
		
		
		return hs;
		
	}

}
