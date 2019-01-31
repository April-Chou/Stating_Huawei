package generic;
import bean.Student;
import bean.Tool;
/*
 * ###16.08_集合框架(泛型的由来)(了解)
* A:案例演示
	* 泛型的由来:通过Object转型问题引入
	* 早期的Object类型可以接收任意的对象类型，但是在实际的使用中，会有类型转换的问题。也就存在这隐患，所以Java提供了泛型来解决这个安全问题。
	* 泛型，种瓜得瓜，种豆得豆
	* （非静态）方法泛型最好与类的泛型一致，也可以不一致，如果不一致，需要在方法上声明该泛型。方法要有自己的泛型
	* 静态方法必须声明自己的泛型，不能跟类一致

 */
public class Demo3_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tool<Student> t = new Tool<>();
		t.setT(new Student("Geralt",23));
		System.out.println(t.getT());
		

	}

}
