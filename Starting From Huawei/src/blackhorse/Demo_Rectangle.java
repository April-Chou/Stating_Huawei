package blackhorse;
import java.util.*;

/*
 * 定义一个长方形类,求周长和面积的方法
 * 定义一个测试类进行测试
 */

class Rectangle {
	private double length;
	private double width;
	
//	construction method
	public Rectangle() {
		
	}
	
//	construction method 2
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
//	set length method
	public void setLength(double length) {
		this.length = length;
	}
//	set width method
	public void setWength(double width) {
		this.width = width;
	}
//	get length width method
	public double getLength() {
		
		System.out.println("This length of this rectangel is " + length);
		return length;
	}
	
//	get width method

	public double getWidth() {
		
		System.out.println("This width of this rectangel is " + width);
		return width;
	}
//	perimeter method
	public void perimeter() {
		double perimeter = 2*(length + width);
		System.out.println("The perimeter of this rectangle is " + perimeter);
	}
//	area method
//	perimeter method
	public void area() {
		double area = length * width;
		System.out.println("The area of this rectangle is " + area);
	}
	
}








// main method to test
public class Demo_Rectangle {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a length to caculate the rectangle :");
		double x = sc.nextDouble();
		System.out.println("Please enter a width to caculate the rectangle :");
		double y = sc.nextDouble();
		sc.close();
//		create a rectangle to caculate
		Rectangle r = new Rectangle(x,y);
//		caaculate the perimeter;
		r.perimeter();
//		caculate the area
		r.area();
	}

}
