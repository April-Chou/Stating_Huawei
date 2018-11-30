package blackhorse;

public class Array_Test {
	
	
	
	
	public static void main(String[] args) {
//		int [] arr = new int [3];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		
//		int [] arr1 = new int [3];
//		int [] arr2 = new int [5];
//		int [] arr3 = arr2;
//		
//		System.out.print(arr1);
//		System.out.println(arr2);
//		System.out.println(arr3);
		
		int [] arr = new int [] {11,22,33,44,55};
		
		System.out.println(arr);
		
		//for 输出数组所有元素
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("......................................................");
		//for each 输出数组所有元素
		for(int a : arr) {
			System.out.println(a);
		}
			
	}	

}
