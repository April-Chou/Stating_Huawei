package array;

import java.util.Arrays;

public class Demo4_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// shuzu to String
		int [] arr = {24,9 ,5,34,23,33,7,17,99};
		System.out.println(Arrays.toString(arr));
		
		//sort
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = {11,22,33,44,55,66,77,88};
		System.out.println(Arrays.binarySearch(arr2, 22));
		System.out.println(Arrays.binarySearch(arr2, 99));//---fu 负的插入点-1

	}

}
