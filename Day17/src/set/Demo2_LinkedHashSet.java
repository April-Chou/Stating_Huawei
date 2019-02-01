package set;

import java.util.LinkedHashSet;
/*
 * LinkedHashSet 底层是链表实现的，是set集合中唯一能保证怎么存怎么取的集合对象，因为是hashset的子类，所以也是保证元素唯一的与hashset的原理一样
 */

public class Demo2_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		
		System.out.println(hs);

	}

}
