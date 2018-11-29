package blackhorse;
import java.util.Scanner;	
public class Scanner_Max {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an intenger: ");
		int x = sc.nextInt();
		System.out.println("Please enter another intenger: ");
		int y = sc.nextInt();
		
		int max = (x > y) ? x : y;
		sc.close();
		
		System.out.println("The max number is " + max);
		
		
	}

}
