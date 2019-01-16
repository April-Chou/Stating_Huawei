package stringbuffer;

public class Demo6_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Geralt");
		String s1 = new String(sb);
		System.out.println(s1);//jiang 将StringBuffer转换为String
		
	}

}
