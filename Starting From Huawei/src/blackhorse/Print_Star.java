package blackhorse;

public class Print_Star {
	public static void star(int a, int b) {
		for(int i = 0; i<=a; i++) {
			
			
			for(int j=0; j<=b; j++) {
				System.out.print("*");
			}
			System.out.println(); //此时换行,好聪明 
		}
			
			
	}
	
//	print 正三角形
	
	public static void triangle() {
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	9 x 9 multiply table
	
	public static void m_table(int a) {
		outer : for(int i=1; i<=a; i++) {     // 标号,用break 标号跳出循环
			inner : for(int j=1; j<=i; j++) {   //开始理解错了
				System.out.print(i * j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
//	''或者双引号  都可以   \t表示制表符
/*
 * \r 表示回车
 * \n 表示换行
 *   \ zhuan yi de
 */
	
	
	
//	main metod
	public static void main(String[] args) {
//		use star method
		star(5,5);
		
//		use triangel method
		triangle();
		
//		use multiply table
		m_table(9);
	}

}
