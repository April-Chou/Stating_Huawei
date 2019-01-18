package wrapperclass;
/*
 * -128----127shi 是Byte的取值范围，如果是在-128至127范围内，自动装箱不会创建新的的对象，而是从常量池中获取，如果超过了127则会创建新的对象
 */

public class Demo5_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = new Integer(97);
		Integer i2 = new Integer(97);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		Integer i3 = 95;
		Integer i4 = 95;
		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));
		
		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5 == i6);
		System.out.println(i5.equals(i6));
		

	}

}
