package blackhorse;

/*
 * 定义一个员工类
 * 自己分析出几个成员,然后给出成员变量
 * 姓名name,工号ID,工资salary
 * 
 * 构造方法,空参和有参的
 * get方法和set方法
 * 显示所有成员信息的方法并测试
 * 
 */

class Employee{
	private String name;
	private int id;
	private double salary;

//	constructon method
	public Employee() {
		
	}
	
//	construction method
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
//	Set method 
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
//	get method#
	public void getInformation() {
		System.out.println("The name of this employee is " + name + " whose id is " + id + " and salary is " + salary);
	}
	
}









public class Demo_Employee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Geralt",0001, 12345);
		e1.getInformation();
	}

}
