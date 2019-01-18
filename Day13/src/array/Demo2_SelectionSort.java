package array;

import java.util.Arrays;

public class Demo2_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {24,9 ,5,34,23,33,7,17,99};
		//selection sort
		System.out.println(Arrays.toString(arr));
		selection_sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	/**
	 * @param arr
	 */
	public static void selection_sort(int[] arr) {
		int temp =0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++ ) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
