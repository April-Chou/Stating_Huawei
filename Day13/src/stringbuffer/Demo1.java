package stringbuffer;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());//r'容器中字符个数 实际值		
		System.out.println(sb.capacity()); // r 容器的初始容量，理论值
		
		StringBuffer sb2 = new StringBuffer(10);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());// g 给多大就是多大
		
		StringBuffer sb3 = new StringBuffer("geralt");
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());// zi 字符串的length+初始容量
		
		
				

	}

}
