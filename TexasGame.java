package Texas;
import java.util.*;

import Texas.Compare;
public class TexasGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("请输入Black所拥有的牌");
		String Black = in.nextLine();
		@SuppressWarnings("resource")
		Scanner in2 = new Scanner(System.in);
		System.out.println("请输入White所拥有的牌");
		String White = in2.nextLine();
		System.out.println(Compare.compare(Black,White)+" win");
	}

}
