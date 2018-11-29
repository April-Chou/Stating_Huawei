package blackhorse;
import java.util.Scanner;

public class Scanner_Equal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an intenger: ");
		int x = sc.nextInt();
		System.out.println("Please enter another intenger: ");
		int y = sc.nextInt();
		sc.close();
		
		Boolean equal = (x == y) ? true : false;
		System.out.println("The intenger " + x +" and " + y + " are " + equal + " in if they are equal");
	}

}
