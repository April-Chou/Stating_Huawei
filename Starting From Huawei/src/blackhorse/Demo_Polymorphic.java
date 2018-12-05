package blackhorse;
/*
 * 多态，事物存在的多种形态
 * 多态的前提：
 * 1. 要有继承
 * 2. 要有重写
 * 3. 要有父类引用指向子类对象
 */

class Animals{
	int num = 10;

	public void eat() {
		
		System.out.println("An animal is Eating");
	}
}

// extends继承
class Cats extends Animals{
	int num = 20;
	public void eat() {
		
		System.out.println("This cat is eatig.....");      //重写了父类的eat方法
	}
}
/*   
 * 成员变量： 编译看左边（父类），运行看左边（父类）---------父类引用指向子类对象
 * 
 * 成员方法：编译看左边（父类），运行看右边（子类）编译看父类，运行看子类（如果父类没相关方法，编译不会通过，会报错）------动态绑定
 * 
 * 静态方法： 编译看左边（父类），运行看左边（父类）---静态和类相关，算不上重写，所以访问还是左边
 * 只有非静态的成员方法，编译看左边，运行看右边。-------动态嘛，所以叫动态绑定
 */

public class Demo_Polymorphic {
	
	public static void main(String[] args) {
		Cats c1 = new Cats();
		c1.eat();
		System.out.println("c1 number is " + c1.num);
		
		Animals c2 = new Cats();              //父类引用指向子类对象
		c2.eat();
		System.out.println("c2 number is " + c2.num);
		
		Animal c3 = new Animal();
		c3.eat();
		
	}

}
