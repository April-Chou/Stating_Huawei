package regex;

public class Demo6_ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geralt2gxy";
		String regex = "\\d";
		String s2 = s.replaceAll(regex, " love ");
		System.out.println(s2);
				

	}

}
