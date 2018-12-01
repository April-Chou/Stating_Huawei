package blackhorse;
/*
 * 一个java文件中写两个类,一个基本类,一个测试类.
 * 建议文件名和测试类名称一致
 * 测试类中要有主方法
 *  
 */

public class Student extends People{
	String name;
	String gender;
	int age;
	private int student_id;
	
	
	
	
//	construction method
	Student(){
		super();
	}
//	construction method 2
	Student(String name,String gender){
		this.name = name;
		this.gender = gender;
		
	}
//	construction method 3
	Student(String name,String gender,int student_id){
		this.name = name;
		this.gender = gender;
		this.student_id = student_id;
	}
//	construction method 4
	Student(String name,String gender,int age,int student_id){
		this.name = name;
		this.gender = gender;
		this.student_id = student_id;
		this.age = age;
	}
//	study method
	public void study(Student st) {
		System.out.println("This student " + st.name+ " is studying");
	}
//	sleep method
	public void sleep(Student st) {
		System.out.println("This student " + st.name+ " is sleeping");
		
	}
//	get id
	public void getID(Student st) {
		System.out.println("The id of " + st.name + " is " + st.student_id);
	}
	
//	overload farther class drink method
	public void drink(Student st) {
		System.out.println("The student " + st.name + " is " + "drink");
	}
	
//	test method
	public void test() {
		System.out.println("Testing!");
	}
	
//	test 01 method
	/*
	 * 必须要用static方法,可以不需要实例化,test_01作为验证匿名对象作为实际参数传递
	 */
	
	public static void test_01(Student st) {
		System.out.println("Testing!");
	}
	
//	main method
	public static void main(String[] args) {
		Student st_1 = new Student("Geralt","male",01);
		Student st_2 = new Student("Yennefer", "female",02,100);
		Student st_3 = new Student("Ciri", "female",03);
//		use sleep method
		st_2.sleep(st_2);
		st_1.study(st_1);
		st_3.getID(st_3);
		
		//WhY is null
		st_3.drink(st_3);
		st_1.eat(st_1);
		new Student().test();   //匿名对象调用,只用一次很合适,多次调用不合适
		/*
		 * 匿名对象可以调用属性,但是没有意义,因为调用后就变成了垃圾,如果需要赋值还是用有名字的对象
		 * 
		 * 匿名对象好处:节省代码,另外匿名对象可以作为实际参数传递.Day 06 calss12, 抽取方法提高代码复用性
		 */
		test_01(new Student());
		
	}
	
	

}
