package test;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import bean.Student;
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the student: ");
		
		TreeSet<Student>  ts = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				int num = s2.getSum() - s1.getSum();
				return num == 0 ? 1 : num;
			}
			
		});
		
		while (ts.size()<5) {
			String line = sc.nextLine();
			String[] arr = line.split(",");
			int chinese = Integer.parseInt(arr[1]);
			int math = Integer.parseInt(arr[2]);
			int english = Integer.parseInt(arr[3]);
			
			ts.add(new Student(arr[0], chinese, math, english));
			
			for(Student s : ts) {
				System.out.println(s);
			}
			
		}

	}

}
