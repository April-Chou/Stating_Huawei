package blackhorse;

public class People {
	String name;
	int age;
	int id;
//	constration method
	public People(String name) {
		this.name = name;
		System.out.println("Name is " + name);
	}
//	overload constration method
	public People() {
		
	}
	
//	eat  method
	public void eat(People p) {
		System.out.println(p.name + " is drinking");
		
	}
//	drink method
	public void drink(People p) {
		System.out.println(p.name + " is eating");
	}
}
