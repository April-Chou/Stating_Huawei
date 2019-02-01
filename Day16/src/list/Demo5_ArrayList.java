package list;

import java.util.ArrayList;

import bean.Person;

/*
 * 
###16.19_z 集合框架(集合嵌套之ArrayList嵌套ArrayList)(掌握)
* A:案例演示
	* 集合嵌套之ArrayList嵌套ArrayList

 */
public class Demo5_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Person>> school = new ArrayList<>();
		ArrayList<Person> wolf = new ArrayList<>();
		wolf.add(new Person("Geralt",21));
		wolf.add(new Person("Ciri",22));
		wolf.add(new Person("Wesemier",23));
		
		ArrayList<Person> witch = new ArrayList<>();
		witch.add(new Person("Yennefer",24));
		witch.add(new Person("Triss",25));
		
		school.add(witch);
		school.add(wolf);
		
		for(ArrayList<Person> a : school) {
			System.out.println(a);
			for(Person p : a) {
				System.out.println(p);
			}
		}

	}

}
