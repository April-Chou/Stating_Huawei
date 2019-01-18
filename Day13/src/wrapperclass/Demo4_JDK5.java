package wrapperclass;
/*
 * Integer x = null 的时候不能自动拆装箱
 */
public class Demo4_JDK5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100;
		Integer ii = new Integer(i);// zhuang xiang
		
		int y = ii.intValue();// chai xiang
		
		Integer i2 = 100; //auto boxing
		int z = i2 + 200; // auto unboxing
		
		System.out.println(y);
		System.out.println(z);

	}

}
