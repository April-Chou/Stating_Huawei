package blackhorse;

import java.util.Scanner;

public class Week_Postout {
//	week method;
	public static void week(int i) {

		switch(i) {
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.print("Today is Tueseday");
			break;
		case 3:
			System.out.println("Today is Wednesday");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		case 6:
			System.out.println("Today is Saturday");
			break;
		case 7:
			System.out.println("Today is Sunday");
			break;
		default:
			System.out.println("Wrong type");
		}
		
	}
	
//	main method
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the day of this week: ");
		int i = sc.nextInt();
		sc.close();
		week(i);
	}


}
