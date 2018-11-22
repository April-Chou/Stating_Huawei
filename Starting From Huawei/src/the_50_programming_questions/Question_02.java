package the_50_programming_questions;



public class Question_02 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a number to see if it is a prime number: ");
//		
//		if(sc != int) {
//			System.out.println("");
//		}
		int c = 0;
		for(int i=101;i<=200;i++) {
			int k = 0;
			for(int j=1;j<=i;j++) {
				double r = i%j;
				if(r==0) {
					k = k+1;
				}

			}
			if(k != 2) {
				
			}
			else {
				c = c+1;
				System.out.println(i+" is a prime number");
			}

			
		}
		System.out.println("The total prime number is "+c);
	}

}
