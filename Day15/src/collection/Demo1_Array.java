package collection;

import bean.Student;

public class Demo1_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] arr = new Student[5];//chuang 创建引用数据类型数组
		arr[0] = new Student("Yennfer",23);
		arr[1] = new Student("Geralt",23);
		arr[2] = new Student("Ciri",23);
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
