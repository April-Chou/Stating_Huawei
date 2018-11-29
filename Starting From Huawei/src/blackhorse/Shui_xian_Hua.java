package blackhorse;

public class Shui_xian_Hua {
	
//	The Method Shui Xian Hua;
	public static void shuixianhua() {
		int temp = 0;
		int j = 0;
		for(int i = 100; i<=999; i++) {
			int digit = i % 10;
			int tenth = i % 100 / 10;
			int hundred = i / 100;
			
			if(i == Math.pow(digit, 3) + Math.pow(tenth, 3) + Math.pow(hundred, 3)) {
				temp = i;
				j++;
				System.out.println(temp + " is a shui xianhua number");
			}
			else {
		}
			
	   }
		System.out.println("The total number of shuixian hua is " + j);
	}
//	main 方法
	public static void main(String[] args) {
		shuixianhua();
	}

}
