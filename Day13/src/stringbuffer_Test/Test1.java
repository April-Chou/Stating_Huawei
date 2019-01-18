package stringbuffer_Test;

import java.util.Arrays;

/*
 *  shuzu 特定形式输出
 */

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2,3};
		demo(arr);
		System.out.println(arr);
		System.out.println(arr.toString());
		System.out.println(Arrays.toString(arr));
		

	}
	
	public static void demo(int[] arr) {
		
		StringBuffer sb = new StringBuffer();
		sb = sb.append("[");
		for (int i=0;i<arr.length;i++) {
			
			
			if(i == arr.length - 1) {
				sb.append(arr[i]);
			}
			else {
				sb.append(arr[i] + ",");
			}
		}
		
		sb = sb.append("]");
		System.out.println(sb);
	}

}
