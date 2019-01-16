package stringbuffer;
/*
 * public StringBuffer replace
 */
public class Demo4_StringBufferMethod {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Geralt of Rivia");
		sb.replace(0, 6, "Carrot");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
