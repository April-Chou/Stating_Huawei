package list;

import java.util.ArrayList;
import java.util.Iterator;

import bean.Person;


public class Demo2_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Person("Yennefer",234));
		list.add(new Person("Geralt",234));
		list.add(new Person("Yennefer",234));
		list.add(new Person("Ciri",234));
		
		System.out.println(list);
		
		System.out.println(singleArray(list));



		

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
	
	//overwrite the singleArray Method
	


}
