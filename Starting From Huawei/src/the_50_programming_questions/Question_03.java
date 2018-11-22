package the_50_programming_questions;

public class Question_03 {
	public static void main(String[] args) {
		
		int count = 0;
		for(int i=100;i<=999;i++) {
//			hundred place
			int h = i / 100;
			int t = i % 100 /10;
			int o = i % 10;
			
			if (i ==(int) Math.pow(h, 3) + Math.pow(t, 3) + Math.pow(o, 3)) {
				System.out.println(i+" is a shui xian hua number");
				count = count+1;
			}
			
//			
		}
		System.out.println("The number of shuixianhua is "+ count);
	
	}

}
