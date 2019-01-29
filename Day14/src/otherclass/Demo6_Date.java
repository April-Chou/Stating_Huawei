package otherclass;
/*
 * 1970.Jan.1st 算是Unix和C语言的生日
 * w 32w 位操作系统所能表示的最大时间间隔为68.1年。最早出现的unix操作系统考虑到计算机产生的年代和应用的时限综合取了1970.1。1作为unix的纪元时间
 * w 64w 位操作系统是千亿年以后才会有时间回溯的现象
 * d 打印出1点是因为电脑系统时间和本地时间的问题
 */
import java.util.Date;

/*
 * zhe 这个Date有两个包，一个util包下，还有一个.sql包下不要导错了。 其中大部分方法已过时
 */
public class Demo6_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		//demo2();
		Date d1 = new Date();
		d1.setTime(1000);
		System.out.println(d1);// she 设置毫秒值，改变时间对象

	}

	/**
	 * 
	 */
	private static void demo2() {
		Date d1 = new Date();
		System.out.println(d1.getTime());// tong 通过时间对象获取毫秒值
		System.out.println(System.currentTimeMillis());//dou 通过系统类的方法获取毫秒值。都是获取当前时间的毫秒值 
	}

	/**
	 * 
	 */
	private static void demo1() {
		Date d1 = new Date();
		System.out.println(d1);
		
		Date d2 = new Date(0);// ru 如果构造方法中参数传为0，则为1907.1.1，如果没传参数则代表当前时间
		System.out.println(d2);// tong 通过毫秒值创建时间对象
	}

}
