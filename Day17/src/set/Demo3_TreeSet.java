package set;

import java.util.TreeSet;
/*
 * TreeSet集合是用来对元素进行排序的，同样也可以保证元素的唯一。
 */

public class Demo3_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(2);
		ts.add(1);
		
		System.out.println(ts);
		
		

	}

}
