package day12.scanner;

import java.util.Scanner;

public class Demo_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an integer : ");
		int i = sc.nextInt();
		System.out.println(i);
		
		System.out.println("Please enter anythings : ");
		boolean b = sc.hasNextBigInteger();//相当于是个判断器，判断是否输入项xx为某一类型，返回boolean类型
		
		
		
		System.out.println(b);
		sc.close();

	}

}
