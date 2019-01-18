package wrapperclass;
//char 的包装类Character中没有parse方法
/*
 * zi 字符串转换为字符数组用toCharArray（）；就可以吧字符串转换为字符数组
 */

public class Demo3_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		String s = "True";
		boolean b = Boolean.parseBoolean(s);
		System.out.println(b);
		
		

	}

	/**
	 * @throws NumberFormatException
	 */
	public static void demo1() throws NumberFormatException {
		int i = 100;
		String s1 = String.valueOf(i);
		System.out.println(s1);
		
		Integer i2 = new Integer(i);
		System.out.println(i2);
		
		String s4 = Integer.toString(i);
		System.out.println(s4);
		
//	conver String to Integer
		String s5 = "200";
		Integer i3 = new Integer(s5);
		int i4 = i3.intValue();
//		conver String to Integer,faster.
		int i5 = Integer.parseInt(s5);
	}

}
