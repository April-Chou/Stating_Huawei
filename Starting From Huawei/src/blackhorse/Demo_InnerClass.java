package blackhorse;

/*
 * A: 内部类概述：  在类中定义类
 * 
 * B： 内部类访问特点
 *           内部类可以直接访问外部类的成员，包括私有
 *           外部类要访问内部类成员，必须创建对象
 *           外部类名。内部类名 对象名 = 外部类对象。内部类对象
 */

class Outer{
	private int num = 10;
	class Inner{
		public void method() {
			System.out.println("Inner ");  // 1 ，     内部类可以直接访问外部类的成员，包括私有
			System.out.println(num);
		}
	}
}

public class Demo_InnerClass {
	
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();  // 1. 创建内部类对象
		oi.method();
	}

}
