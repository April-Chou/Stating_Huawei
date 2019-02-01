package set;

import java.util.HashSet;
/*
 * set集合无索引，不可以重复，无序（存取不一致）
 */

public class Demo1_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		hs.add("e");
		
		System.out.println(hs);
		System.out.println(b1);
		System.out.println(b2);
		
		for(String i : hs) {
			System.out.println(i);
		}

	}

}
