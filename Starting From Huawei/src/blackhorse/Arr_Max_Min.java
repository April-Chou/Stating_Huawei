package blackhorse;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_Max_Min {
	
//	method to go through the array
	public static void go_through(int[] arr) {
		for(int a : arr) {
			System.out.println(arr[a]);
		}
	}
	
//arr.length to print the array
	
	public static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
//	method to find the max/min of array
	public static void  finding(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<arr.length;i++) {
			//find the max
			if(arr[i] >= max) {
				max = arr[i];
			}
			//find the min
			if (arr[i] <= min) {
				min = arr[i];
			}
			
			
		}
		System.out.println("The max of the array is " + max);
		System.out.println("The min of the array is " + min);
		
	}
	
//	reverse method of an array
	public static void reverse(int arr[]) {
		int n = arr.length - 1;
		int temp = 0;
		//for loop to reverse
		for(int i=0; i<arr.length/2; i++) {     //this part I reverse too much , actually length/2 is enought and no need to seperate the even or odd
//			no need to tell its even or odd
			temp = arr[i];
			arr[i] = arr[n - i];
			arr[n-i] = temp;
		}
		//use print method to print the arrays
		print(arr);
	}
	
//	according to the number to get the week
	public static void week(int i) {
		String [] arr = new String[] {"This is not a day in a week. ","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunadya"};
		switch(i) {
		case 1 :
			System.out.println(arr[1]);
			break;
		case 2 :
			System.out.println(arr[2]);
			break;
		case 3:
			System.out.println(arr[3]);
			break;
		case 4:
			System.out.println(arr[4]);
			break;
		case 5:
			System.out.println(arr[5]);
			break;
		case 6:
			System.out.println(arr[6]);
			break;
		case 7: 
			System.out.println(arr[7]);
			break;
		default:
			System.out.println(arr[0]);
			break;
			
		}
		
	}
	
//	the method to find the first show of an element in an array and how many times shows in the array.
	public static int index_array(int arr[], int value) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(value == arr[i]) {
				System.out.println("The index of selected element shows in the array is " + i);
				count ++;
			}
		}
		System.out.println("The value " + value + " shows " + count +" times in the array.");
		return count;
	}
	
	public static void main(String[] args) {
		int [] arr = new int[] {22, 11, 66, 55,44,32,89,17,60,94,87,100,4,6,2,0,22};
//		use the method of finding
		finding(arr);
		print(arr);
		reverse(arr);
		
//		catch the keybord input and use the week method
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an int to see the week: ");
		int input = sc.nextInt();
		sc.close();
		week(input);
		index_array(arr,22);
		
		
		
	}

}
