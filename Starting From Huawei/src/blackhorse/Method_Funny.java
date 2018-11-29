package blackhorse;
import java.util.*;
public class Method_Funny extends Print_Star{
	public static void main(String[] args) {
//		keybord input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the row number");
		int x = sc.nextInt();
		System.out.println("Please enter the column number:");
		int y = sc.nextInt();
		
		
//		using the star method extends from the class Print_Star
		star(x,y);
		
//		using the multiply table method
		System.out.println("Please enter a number to see the multiply table: ");
		int z = sc.nextInt();
		sc.close();
		m_table(z);
	}

}
