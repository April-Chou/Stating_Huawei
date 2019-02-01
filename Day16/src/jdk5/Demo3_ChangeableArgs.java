package jdk5;
/*
 * ###16.17_ z集合框架(可变参数的概述和使用)(掌握)
* A:可变参数概述
	* 定义方法的时候不知道该定义多少个参数
* B:格式
	* 修饰符 返回值类型 方法名(数据类型…  变量名){}
* C:注意事项：
	* 这里的变量其实是一个数组
	* 如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
 */
public class Demo3_ChangeableArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {11,22,33,44,55};
		print(arr);
		print(55,66,77);

	}
	
	public static void print(int ... arr) {
		for(int i : arr) {
			System.out.println(i);  //z 增强for循环不行，可以，的因为不能在循环体内的i加数据类型
		}
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}

}
