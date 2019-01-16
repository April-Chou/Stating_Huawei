package stringbuffer;

public class Demo3_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("Geralt 5");
		System.out.println(sb);
		sb.deleteCharAt(7);
		System.out.println(sb);
		sb.delete(2, 4);
		System.out.println(sb);//han 含头不含尾
		
		sb.delete(0, sb.length()); //qing 清空容器，
		System.out.println(sb);
		// sb = new StringBuffer() , 不要用这种方式清空缓冲区，原来的会变成垃圾，相当于混鸡尾酒把杯子扔了		

	}

}
