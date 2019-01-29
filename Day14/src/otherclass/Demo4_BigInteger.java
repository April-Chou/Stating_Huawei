package otherclass;

import java.math.BigInteger;

/*
 * Big Integer: 可以让超过Integer范围内的数据进行运算
 */
public class Demo4_BigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "1234567890987654321";//xian 先转化为字符串
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("2");
		
		System.out.println(bi1.add(bi2));
		System.out.println(bi1.subtract(bi2));
		System.out.println(bi1.multiply(bi2));
		System.out.println(bi1.divide(bi2));
		System.out.println(bi1.divideAndRemainder(bi2));
		
		BigInteger arr [] = bi1.divideAndRemainder(bi2); //qu 取除数和余数
		for (int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
