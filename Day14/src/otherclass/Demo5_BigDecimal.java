package otherclass;

import java.math.BigDecimal;

public class Demo5_BigDecimal {
	public static void main(String[] args) {
		System.out.println(2.0 - 1.1);//jing 精度损失
		
		BigDecimal bd1 = new BigDecimal("2.0");
		BigDecimal bd2 = new BigDecimal("1.1");
		BigDecimal bd3 = new BigDecimal(2.0);
		BigDecimal bd4 = new BigDecimal(1.1);//kai 开发时候不推荐这个，推荐字符串形式传入
		
		BigDecimal bd5 = BigDecimal.valueOf(2.0);
		BigDecimal bd6 = BigDecimal.valueOf(1.1);//zhe 这种方法也是推荐的
		
		System.out.println(bd1.subtract(bd2));
		System.out.println(bd3.subtract(bd4));
		System.out.println(bd5.subtract(bd6));
		
	}

}
