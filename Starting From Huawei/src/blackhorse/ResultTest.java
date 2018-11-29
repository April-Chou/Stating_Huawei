package blackhorse;
import java.util.*;

public class ResultTest {
	
//	grade method
	
	public static String result(int re) {
		String grade = "";
		if(re >= 90 && re <= 100) {
			grade = "A";
		}
		
		else if (re >=80 && re<= 89) {
			grade = "B";
	}
		
		
		else if (re>=70 && re >= 79) {
			grade = "C";
		}
		
		else if(re>=60 && re<=69){
			grade = "D";
		}
		
		else {
			grade = "E";
		}
		System.out.println("The grade of the result is " + grade);
		return grade;
		
		
	}
	
//	the value of y
	public static double y_value(double x) {
		double y = 0;   //尽量给Y赋值
		if(x>=3) {
			y = 2*x + 1;
		}
		
		else if(x>-1 && x<3) {
			y = 2*x;
		}
		
		else {
			y = 2*x - 1;
		}
		System.out.println("The value of y is " + y);
		return y;
	}
	
//	main method
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer to checke the grade of this student: ");
		int grade = sc.nextInt();
		result(grade);
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("Please enter an x value to know the y value: ");
		double y = sc.nextDouble();
		y_value(y);
		sc.close();
	}

}
