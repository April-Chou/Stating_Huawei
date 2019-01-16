package day12.test;

public class Test7 {
	public static void main(String[] args) {
		String max = "Geralt of rivia, Geralt is a witcher who raised and trained in kae morhan, Geralt is a witcher who has affairs with a lot of sourceries";
		String min ="Geralt";
		 
		
		find(max, min);
		System.out.println(count);
	}
	static int count = 0;
	//ci此处用了递归，做了个静态变量，好好理解此处。也可以用循环写这道题

	public static void find(String max, String min) {
		
		int index = max.indexOf(min);
//		System.out.println(index);
		if(index == -1) {
//			System.out.println("There are not min string in the max String");
		}
		
		else {
			count ++;
			max = max.substring(index + min.length());
//			System.out.println(max);
			find(max, min);
//			System.out.println(count);
		}
		
		
		
		
	}

}
