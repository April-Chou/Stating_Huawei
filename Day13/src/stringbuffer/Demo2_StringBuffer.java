package stringbuffer;
/*
 * StringBuffer 的添加功能， public StringBuffer append(String str)
 *    可以把任意数据类型添加到字符缓冲区里
 *    public StringBuffer insert(int offset, String str)
 *    zai 在指定位置把任意数据类型的数据插入到字符串缓冲区里面，并返回字符串缓冲区本身
 *    
 *    stirngbuffer 是字符串缓冲区，当new的时候是在堆内存创建了一个对象，底层是一个长度为16的字符数组
 *    当调用添加的方法时，不会再重新创建对象，在不断的向原缓冲区去添加对象
 */
public class Demo2_StringBuffer {
	public static void main(String[] args) {
		demo1();
		
		StringBuffer sb = new StringBuffer();
//		sb.insert(3, "Geralt");//hui 会出现字符串索引越界异常
		StringBuffer sb2 = new StringBuffer("1234");
		sb2.insert(3, "Geralt");// zai在指定位置添加元素，如果没有指定位置则会报索引越界异常
		System.out.println(sb2);
		
	}

	private static void demo1() {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = sb.append(true);
		StringBuffer sb3 = sb.append("geralt");
		StringBuffer sb4 = sb.append(100);
		
		System.out.println(sb);
		System.out.println(sb2.toString()); //jia 加不加toString 都一样。Stringbuffer重写了toString方法，显示的是对象的属性值
		System.out.println(sb3);
		System.out.println(sb4);  //si 四个引用指向同一个对象
	}

}
