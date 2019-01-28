 package otherclass;
/*
 * System.in是标准的键盘输入流
 * System.out标准的输出流，输出到控制台
 * 在一个源文件中不允许有两个public类
 * curentTimemills,1970年的时间到现在，用于计算当前时间的毫秒值
 * arrcopy很方便的拷贝数组
 */
public class Demo3_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//time_caculate();
		int src [] = {1,2,3,4,5,6};
		int des [] = new int[8];
		System.arraycopy(src, 0, des, 0, src.length);
		
		for (int i=0; i<des.length;i++) {
			System.out.println(des[i]);
		}

	}

	/**
	 * 
	 */
	private static void time_caculate() {
		long start = System.currentTimeMillis();
		for(int i=0; i<=999; i++) {
			System.out.println("*");
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
