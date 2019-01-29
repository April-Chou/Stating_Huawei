package test;
import java.util.*;
/*
 * li 利用2月28天还是29天判断闰年与否
 */
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the year: ");
		String line = sc.nextLine();
		sc.close();
		int year = Integer.parseInt(line);
		c.set(year, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		int feb_day = c.get(Calendar.DAY_OF_MONTH);
		if(feb_day == 29) {
			System.out.println("Leap Year");
		}
		else if(feb_day == 28) {
			System.out.println("Not Leap Year");
		}
		else {
			System.out.println("error");
		}
		
		

	}

}
