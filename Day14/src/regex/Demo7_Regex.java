package regex;
//fen zu
public class Demo7_Regex {
	public static void main(String[] args) {
		//demo1();
		String s = "II...II...II.love...love love...love programming";
		String s1 = s.replaceAll("\\.+", " ");
		System.out.println(s1);
		String s2 = s1.replaceAll("(.)\\1+", "$1");//$拿到组里的元素
		System.out.println(s2);
		String s3 = s2.replaceAll("(..)\\1+", "$1");
		System.out.println(s3);
		String regex = "(.....)\\1+";
		String s4 = s3.replaceAll("(.....)\\1+", "$1");
		System.out.println(s4);
	}

	/**
	 * 
	 */
	private static void demo1() {
		String regex = "(.)\\1(.)\\2";
		String regex1 = "(..)\\1";
		String regex2 = "(.)\\1+";//+号代表第一组出现一次或多次
		String s = "sdqqfgkkkhjppppl";
		System.out.println("RRAA".matches(regex));
		System.out.println("RrAA".matches(regex));
		System.out.println("RaRa".matches(regex1));
		String [] arr = s.split(regex2);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
