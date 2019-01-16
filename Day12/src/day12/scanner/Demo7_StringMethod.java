package day12.scanner;

public class Demo7_StringMethod {
	public static void main(String[] args) {
		String s1 = "Geralt of Rivia";
		
		String s2 = s1.replace("i", "e");
		System.out.println(s2);
		
		String s3 = s1.replace("ia", "iea");
		System.out.println(s3);
		
		String s4 = s1.replaceFirst("i", "e");
		System.out.println(s4);
	}

}
