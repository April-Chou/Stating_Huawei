package blackhorse;
import java.util.*;

/**
 * 
 * @author cWX636164
 * 
 * This is shit , do not see this 
 * 
 * it should be a guess number game;
 *
 */






public class Demo_GuessNumberGame {
	
//	guess method
	public void guess(int gue, int rand) {
		for(int i = 0; ;i++) {
			if(gue < rand) {
				System.out.println("Smaller");
			}
			
			else if(gue > rand) {
				System.out.println("Bigger");
			}
			
			else{
				System.out.println("Equal");
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		/**
		 * add a random seed to gain the chance of a random number;
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number as the random seed: ");
		int x = sc.nextInt();
		Random ran = new Random(x);
		int num = ran.nextInt(99) + 1;
		
		//print out a random 
		System.out.println(num);
		
//		guess()
	}

}
