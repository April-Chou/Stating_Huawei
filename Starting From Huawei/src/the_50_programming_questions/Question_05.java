package the_50_programming_questions;

import java.util.Scanner;

//  over 90 A,60-89 B, under 60 C

public class Question_05 {
	
	public static String grade(int mark) {
		String result = null;
		if(mark >=90) {
			result = "A";
		}
		
		else if(mark >= 60 && mark <= 89) {
			result = "B";

		}
		
		else if(mark<=60){
			result ="C";
			
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a int: ");
		
		int number = sc.nextInt();
		System.out.println(grade(number));
		
		
		
		
	}
	

}
