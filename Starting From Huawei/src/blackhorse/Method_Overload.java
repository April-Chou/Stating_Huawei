package blackhorse;

// 方法重载可以返回值类型不同 ; 参数顺序不同也是一种新的方法重载,但开发时候不会这么写

public class Method_Overload {
	public static int add_() {
		return 0;
	}
	
//	method overload
	public static int add_(int i, int j) {
		int total = i + j;
		return total;
	}
// three number overload	
	public static int add(int i, int j, int k) {
		int total = i + j + k;
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println(add_(2,3));
	}

}
