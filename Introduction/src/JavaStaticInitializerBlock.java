import java.util.Scanner;

public class JavaStaticInitializerBlock {

	static Scanner in = new Scanner(System.in);
	static int B = in.nextInt();
	static int H = in.nextInt();

	// using a private static method to return error if input is negative
	// all methods like this are run before other code
	static boolean flag = true;

	static {

		if (B <= 0 ||  H <= 0 ) {
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		
	}

	/*
	 * This is an alternative way that used private static fields
	 * 
	 * private static boolean flag() { if (B <=-100 || B >=100 || H<=-100 || H>= 100
	 * ) {
	 * System.out.println("java.lang.Exception: Breadth and height must be positive"
	 * ); return false ;
	 * 
	 * } return true; }
	 */

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class
