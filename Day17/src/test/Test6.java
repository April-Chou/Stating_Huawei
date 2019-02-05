package test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer, quit please enter quit: ");
		
		//comparator
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				// TODO Auto-generated method stub
				int num = i2 - i1;
				return num == 0 ? 1 : num;
			}
			
		});
		
		//while loop
		
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line)) {
				System.out.println("The program has quitted. ");
				break;
			}
			else {
				Integer i = Integer.parseInt(line);
				ts.add(i);
			}
		}
		
		for(Integer i : ts) {
			System.out.println(i);
		}

	}

}
