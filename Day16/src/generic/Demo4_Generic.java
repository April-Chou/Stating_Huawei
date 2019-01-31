package generic;

public class Demo4_Generic {

}

interface Inter<T>{
	public void show(T t);
}

//class Demo implements Inter<String>{    //推荐这种
//
//	@Override
//	public void show(String t) {
//		// TODO Auto-generated method stub
//		System.out.println(t);
//	}
//	
//}
class Demo<T> implements Inter<T>{   //没有必要实现接口的时候给自己类添加泛型

	@Override
	public void show(T t) {
		// TODO Auto-generated method stub
		System.out.println(t);
		
	}
	
}