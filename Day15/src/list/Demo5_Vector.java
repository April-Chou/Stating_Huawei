package list;
/*
 * bei 被淘汰的容器类型，基本不会用
 */

import java.util.Enumeration;
import java.util.Vector;

public class Demo5_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.addElement("a");
		v.addElement("b");
		v.addElement("c");
		v.addElement("d");
		
		Enumeration en = v.elements();//h 获取枚举
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		

	}

}
