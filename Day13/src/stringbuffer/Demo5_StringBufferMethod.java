package stringbuffer;

public class Demo5_StringBufferMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Geralt of Rivia");
		System.out.println(sb);
		
		String sb2 = sb.substring(5); //fan 返回值不再是Stringbuffer本身而是String，要用String接受
		System.out.println(sb2);

	}

}
