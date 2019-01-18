package array;

import java.util.Arrays;

public class Demo1_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {24,9 ,5,34,23,33,7,17,99};
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		bubble_sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	/**
	 * @param arr
	 */
	public static void bubble_sort(int[] arr) {
		//bubble sort
		int temp = 0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] >= arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
