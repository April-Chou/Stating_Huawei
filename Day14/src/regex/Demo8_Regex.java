package regex;
//pattern matcher method
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * get phone number
 */

public class Demo8_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		String s = "geralt13789887656yennefer13789867465,triss13721223456";
		String regex = "1[3578]\\d{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		//demo2(m);
		while(m.find()) {
			System.out.println(m.group());
		}
	
		

	}

	/**
	 * @param m
	 */
	private static void demo2(Matcher m) {
		boolean b = m.find();
		String number = m.group();
		
		System.out.println(b);
		System.out.println(number);//得先找再获取
	}

	/**
	 * 
	 */
	private static void demo1() {
		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher("aaaaaaaaaab");
		boolean b = m.matches();
		System.out.println(b);
	}

}
