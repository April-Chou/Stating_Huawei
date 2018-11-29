package blackhorse;

import java.util.*;
public class If_test {
	
//	max two method
	public static int max_two (int x, int y) {
		int max = (x > y) ? x : y;
		System.out.println("The max number of this two is " + max);
		return max;
		
	}
	
//	tell the even or the odd
	public static String even_odd(int x) {
		String a = "even";
		String b = "odd";
		String c = (x % 2 == 0) ? a : b;
//		如果开发的话能用三元运算符就用三元运算符,因为写起来相对简单
		System.out.println("This number is "+ c);
		return c;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please  enter an intenger ");
		int x = sc.nextInt();
		System.out.println("Please  enter another intenger: ");
		int y = sc.nextInt();
		System.out.println("Now tell who is the bigger number: ");
		max_two(x,y);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Please  enter an intenger to tell the odd or even: ");
		int z = sc.nextInt();
		even_odd(z);
		sc.close();
		
		
	}

}
