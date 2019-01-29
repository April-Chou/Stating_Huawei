package otherclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DateFormat 是抽象类，不允许实例化。
 * zhong 重点学习SimpleDateFormat
 */

public class Demo7_SimpleDateFormat {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//DateFormat df1 = DateFormat.getDateInstance();
		//demo1();
		//demo2();
		String str = "1992/08/03 08:13:14";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//chuang 创建日期格式化类对象
		Date d = sdf.parse(str);     //jiang 将时间字符串转换成日期对象
		System.out.println(d);
		
		
		

	}

	/**
	 * 
	 */
	private static void demo2() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//chuang 创建日期格式化类对象
		
		System.out.println(sdf.format(d));//jiang 将日期对象转换为字符串
	}

	/**
	 * 
	 */
	private static void demo1() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(d);
		System.out.println(sdf.format(d));
	}

}
