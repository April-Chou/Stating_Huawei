package blackhorse;
/*
 * private 关键字特点:
 * 1.private是一个权限修饰符
 * 2. 可以修饰成员变量和成员方法
 * 3. 被其修饰的成员只能在本类访问
 * 
 * 封装和private应用:
 * 把成员变量用private修饰
 * 提供get和set方法
 * private仅仅是封装的一种形式,不能说封装就是私有.
 * 
 * 用this区分成员变量和局部变量
 * 在成员变量前面加个this.
 * this.age 就相当于p1.age.
 * 
 */

class Person{
	public String name;
	private int id;
	private int age;
	
// below are the constractor	
	public Person() {			
	
}
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int id, int age) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
//	set age method
	public void setAge(int age) {
		this.age = age;
		System.out.println("The age has been set as " + age);
	}
// get age method	
	public void getAge() {
		System.out.println("The age is " + age);
	}

// set id method
	public void setID(int x) {
		id = x;
		System.out.println("The age has been set as " + id);
	}
	
	
	
//	get id method
	public void getID() {
		System.out.println("The age is " + id);
	}
	
}	








public class Demo_Encapsulation {
	public static void main(String[] args) {
		Person p1 = new Person("Geralt",01,20);
		p1.getAge();
		p1.getID();
		p1.setAge(100);
	}

}
