package day12.test;
import java.util.*;
/*
 * zi 字符串反转
 */

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: "); 
		String income = sc.nextLine();
		
		char temp = ' ';
		char [] arr = income.toCharArray();
//		for(int i=0; i<arr.length/2; i++) {
//			temp = arr[i];
//			arr [i] = arr[i-1];
//			arr[i-1] = temp;
//			
//		}
//		System.out.println(arr);
		String s = "";
		for(int i = arr.length-1; i>=0; i--) {//  d倒着遍历
			s = s + arr[i];
		}
		System.out.println(s);

	}

}
