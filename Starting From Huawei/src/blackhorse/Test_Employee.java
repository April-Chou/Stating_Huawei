package blackhorse;
/*
 * 假如我们开发系统时需要对程序猿类进行设计，程序员包含三个属性： 姓名。工号。以及工资
 * 经理，除了含有程序员属性外，还另有一个奖金属性
 * 继承思想来设计出程序员类和经理类，要求类中提供必要的方法进行属性访问
 * 
 */

abstract class Employees{
	private String name;
	private int id;
	private double salary;
	
	public Employees() {
		
	}
	
	public Employees(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public void getName() {
		System.out.println(name);
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void getID() {
		System.out.println(id);
	}
	
	public abstract void work();
}

//  class of programmer
class Programmer extends Employees{
	
	public Programmer() {
		
	}
	
	public Programmer(String name, int id, double salary) {
		super(name, id, salary);
		
	}
		
	public void work() {
		System.out.println("Programming");
	}	
}

// class of manager

class Manager extends Employees{
	
	private double bonus;
	
	public Manager() {
		
	}
	
	public Manager(String name, int id, double salary,  double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}
	
	public void work() {
		System.out.println("Managing" + bonus);
	}
}

public class Test_Employee {

}
