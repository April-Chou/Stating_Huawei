package test;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a series String: ");
		String s = sc.nextLine();
		sc.close();
		
		HashSet<Character> hs = new HashSet<>();
		char [] ca = s.toCharArray();
		for(Character c : ca) {
			hs.add(c);
		}
		
		System.out.println(hs);

	}

}
