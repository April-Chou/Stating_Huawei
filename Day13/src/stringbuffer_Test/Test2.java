package stringbuffer_Test;
/*
 * zi  字符串反转
 */
import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse();
		
		

	}

	private static void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String type_in = sc.nextLine();
		sc.close();
		StringBuffer sb = new StringBuffer();
		sb = sb.append(type_in);
		//reverse
		sb = sb.reverse();
		System.out.println(sb);
		return;
	}

}
