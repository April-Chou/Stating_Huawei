package blackhorse;

public class For_exercise {
//	sum method
	public static int sum_all() {
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum = sum + i;
		}
		System.out.println("The Total of sum is " + sum);
		return sum;
	}

//	even or odd sum method
	public static void sum_even_and_odd() {
		int sum_even = 0;
		int sum_odd = 0;
		for(int i=0; i<=100; i++) {
			if(i % 2 == 0) {
				sum_even = sum_even + i;
			}
			else {
				sum_odd += i;
			}
			
		}
		System.out.println("The total of even is " + sum_even);
		System.out.println("The total of odd is " + sum_odd);
	}
	
//	main method
	public static void main(String[] args) {
		sum_all();
		sum_even_and_odd();
	}
}
