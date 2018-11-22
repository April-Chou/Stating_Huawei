package the_50_programming_questions;

public class Question_1 {
	public static void main(String[] args) {
		long arr [] = new long [36];
		arr[0] = arr[1] = 1;
		System.out.println("第一个月的兔子数量是1对");
		System.out.println("The second month of the rabbits is 1 pair");
		
		for (int i=2;i<=35;i++) {
			arr[i] = arr[i-1] + arr[i-2];
			
			System.out.println("The pair of the rabbit in " + i + " month is "+ arr[i]);
		}
		
	}

}
