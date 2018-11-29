package blackhorse;
import java.util.*;

public class Three_Max {
//	maxmium  method
	
	public static int max(int x, int y, int z) {
		int temp = (x > y) ? x : y;
		int maxmium = (temp > z) ? temp : z;
		System.out.println("The max of this three number is " + maxmium);
		return maxmium;
	}
	
//	main method
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first intenger: ");
		int x = sc.nextInt();
		
		System.out.println("Please enter the second intenger: ");
		int y = sc.nextInt();
		System.out.println("Please enter the third intenger: ");
		int z = sc.nextInt();
		sc.close();
		
		max(x,y,z);
		
		
		
	}

}
