package day12.test;
/*
 * 1. 案例演示
 *   需求： 模拟登陆，给三次机会，并提示还有几次
 *   用户名和密码都是admin
 */

import java.util.Scanner;

public class Test1 {
	
	
	public static void login() {
		int count = 0;
		int left_chance = 0;
		for(int i=0;i<=2;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the user name: ");
			String user = sc.nextLine();
			System.out.println("Please enter the password: ");
			String password = sc.nextLine();
			
			if("admin".equals(user) && "admin".equals(password)) {
				System.out.println("Sign in completed");
				break;
		    }
			else {
				count++;
				left_chance = 3 - count;
				if(count == 3) {
					System.out.println("Blocked");
				}
				System.out.println("What you entered is wrong, Please try again: ");
				System.out.println("you have tried " + count +", "+" only " + left_chance + " allowed. ");
				
				
			}
			
		}
		
		
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login();
	}

}

