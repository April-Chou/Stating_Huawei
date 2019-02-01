package test;

import java.util.HashSet;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		HashSet<Integer> hs = new HashSet<>();
		
		while(hs.size() < 10) {
			
			hs.add(r.nextInt(20) + 1);
		}
		
		for(Integer i : hs) {
			System.out.println(i);
		}

	}

}
