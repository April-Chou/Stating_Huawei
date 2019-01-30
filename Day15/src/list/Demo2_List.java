package list;

import java.util.ArrayList;

import bean.Student;

public class Demo2_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(new Student("Yennefer",22));
		al.add(new Student("Geralt",23));
		al.add(new Student("Ciri",24));
		al.add(new Student("Triss",25));
		
		//Object [] arr = al.toArray();
		for(int i=0; i<al.size(); i++) {
			//System.out.println(arr[i]);
			System.out.println(al.get(i));//可以用get方法
		}
		

	}

}
