package day12.test;

/*
 * caculate how many uppercase, lowercase , how many numbers, and other character shows in a String
 */

public class Test3 {
	public static void main(String[] args) {
		String s = "ABCDasdfgae$&*()$%234geralt";
		
		int count_uppercase = 0;
		int count_lowercase = 0;
		int count_number = 0;
		int count_other = 0;
		for(int i=0; i<s.length();i++) {
			char check = s.charAt(i);
			
			if(Character.isUpperCase(check)) {
				count_uppercase = count_uppercase + 1;
				
			}
			
			else if(Character.isLowerCase(check)) {
				count_lowercase = count_lowercase + 1;
			}
			
			else if (Character.isDigit(check)) {
				count_number = count_number + 1;
				
			}
			
			else {
				count_other = count_other + 1;
			}
		}
		
		System.out.println("Uppercase is " + count_uppercase);
		System.out.println("Lowercase is " + count_lowercase);
		System.out.println("Number is " + count_number);
		System.out.println("Other is " + count_other);
		
	}

}
