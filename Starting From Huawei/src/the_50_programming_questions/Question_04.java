package the_50_programming_questions;

import java.util.Scanner;

public class Question_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an positive intenger: ");
		int number = sc.nextInt();
		// use the method to check if it is positive. 
		
		check_positive(number);
		
	}
	
	// the method: check the number if it is positive. 
	public static int check_positive(int i) {
		if(i>=0) {
			return i;
		}
		
		//method digui diaoyong
		else {

			System.out.println("The number is negative, please retry again. ");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter an positive intenger: ");
			int number = sc.nextInt();
			return (check_positive(number));
			 
//			
			
		}
		
	}
	
	//fraction method;
//	public static int fraction(int j) {
//		
//		for(int k=2, k<=j,k++) {
//			
//		}
//
//	}

}
