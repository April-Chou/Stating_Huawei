package blackhorse;

/*
 * The story of Superman, which you can understand the polymorphic better. 
 */
class  Human_Being{
	
	String name = "Clark Kent";
	
	public void business() {
		System.out.println("Clark Kent is doing business. ");
	}
}

// superman extends human beings

class Superman extends Human_Being{
	String name = "Superman";
	
	public void business() {
		System.out.println("Superman is doing billions business");
	}
	
	public void fly() {
		System.out.println("Flying out to save people");
	}
}

public class Demo_Superman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human_Being p = new Superman(); //父类引用指向子类对象，有继承，有重写，多态
                                       //超人提升为人是向上转型		                               
		
		System.out.println(p.name);  //输出结果为Clark Kent， 因为超人当以human出现，示人的形象为Clark Kent
		p.business();   //动态绑定，表现真正的行为，编译看父类，运行看子类
		// p.fly(); 虚拟机编译看父类，父类没有fly方法，所以编译出错了，因此需要向上转型或者向下转型
		
		Superman sm = (Superman) p;  //先有向上转型，才有向下转型，此为向下转型。
		
		sm.fly(); 
		/*
		 * 多态的弊端： 不能直接使用子类特有的属性和方法
		 * 
		 * 多态的好处： 提高了代码的维护性（继承保证）
		 * 提高了代码的扩展性（由多态保证）
		 * 多态当参数比较好，因为扩展性强
		 * 
		 */
		
	}

}
