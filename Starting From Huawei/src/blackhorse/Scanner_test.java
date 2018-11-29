package blackhorse;

import java.util.Scanner;

public class Scanner_test {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an intenger: ");
		int x = sc.nextInt();
		System.out.println("Please enter another intenger: ");
		int y = sc.nextInt();
		
		int total = x + y;
		sc.close();
		System.out.println("The total of the two intenger is " + total);
		
	}

}
