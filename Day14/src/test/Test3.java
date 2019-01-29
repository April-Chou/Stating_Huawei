package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String bir = new String("1992.08.03");
		String today = new String("2019.01.29");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date d1 = sdf.parse(bir);
		Date d2 = sdf.parse(today);
		System.out.println(d2.getTime());
		long time = d2.getTime() - d1.getTime();
		System.out.println(time);
		long days = time/1000/60/60/24/365;
		System.out.println(days);

	}

}
