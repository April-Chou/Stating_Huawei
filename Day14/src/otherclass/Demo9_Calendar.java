package otherclass;

import java.util.Calendar;

public class Demo9_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, +1);
		c.set(Calendar.YEAR, 2000);
		c.set(2000, 8, 9);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.YEAR) + c.get(Calendar.MONTH) + c.get(Calendar.DAY_OF_MONTH));
		
	

	}

	/**
	 * 
	 */
	private static void demo1() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));//0-11fen 分别指代1-12月
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//zhou 周日是第一天，周六是最后一天
		System.out.println(getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}
	
	public static String getWeek(int week) {
		String arr[] = {"","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		return(arr[week]);
	}

}
