package array;
import java.util.*;
public class Demo3_Bisection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,22,33,44,55,66,77,88};
		
		bisection(arr);
		

	}

	/**
	 * @param arr
	 */
	public static void bisection(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number you want to find: ");
		int target = sc.nextInt();
		sc.close();
		
		int min = 0;
		int max = arr.length-1;
		int mid = (min + max) / 2;
		
		if(target > arr[max] | target <arr[min]) {
			System.out.println("Data not in the database. ");
		}
		else {
			while(target != arr[mid]) {
				if(target < arr[mid]) {
					max = mid-1;
					mid = (min + max) / 2;
					
					if (min > max) {
						System.out.println("Not in System. ");
					}
				}
				else if(target > arr[mid]) {
					min = mid + 1;
					mid = (min + max) / 2;
				}
				
			}
		}
		
		System.out.println(mid);
	}

}
