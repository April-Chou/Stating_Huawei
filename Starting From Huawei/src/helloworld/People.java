package helloworld;

public class People {
	private String name;
	private int age;
	private int id;
	
	public static void eat() {
		System.out.println("This guy is eating");
	}
	
	public static void drink() {
		System.out.println("This guy is drinking");
	}
	
//	get name method
	
	public  String getName() {
		return name;
	}
	
//  set name
	public String setName(String name) {
		this.name = name;
		return name;
		
	}
//	get age
	
	public int getAge() {
		return age;
	}
//	set age
	public int setAge(int age) {
		this.age = age;
		return age;
	}
	
	public int getID() {
		return id;
	}
//	set ID
	public int setID(int id) {
		this.id = id;
		return id;
	}

}
