package day12.scanner;
/*
 * A: 两个常用的方法， 
 *      *public int nextIn()获取一个int类型的值
 *      *public String nextLine()获取一个String类型的值
 * B: 案例演示
 *    a 先演示获取多个int值，多个String值的情况；
 *    b 再演示获取int值，再获取String值得情况；
 *    
 *    nextInt是键盘录入整数的方法，当我们录入10的时候
 *    其实是在键盘上录入10   /r/n, nextInt()方法获取到10的时候就结束了
 *    nextLine是键盘录入字符串的方法，可以接收任意类型，但是他凭什么能获取一行呢
 *      通过 /r/n，只要遇到/r/n就证明一行结束
 *      
 *      解决方案
 *      1.chuan创建两次对象，但是浪费空间
 *      2. j 键盘录入的都是字符串，都用nextLine方法，后面学习会将整数字符串转换为整数的方法
 *      可以全以字符串形式录入，推荐这么做
 *      
 *    
 * 
 * 
 * 
 * 
 * 
 * 
 */


public class Demo2_Scanner {
	public static void main(String[] args) {
		
	}

}
