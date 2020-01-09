import java.util.Scanner;

public class JavaStringsIntroduction {

	private static boolean aAfterb(String a, String b) {

		if (a.compareTo(b) <= 0)
			return true;

		else
			return false;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String a = in.next();

		String b = in.next();

		int sumOfLengths = a.length() + b.length();

		System.out.println(sumOfLengths);
		
		
		if (aAfterb(a, b) == false)
			System.out.println("Yes");

		if (aAfterb(a, b) == true)
			System.out.println("No");

		String capitalisedConcatenated = a.substring(0,1).toUpperCase()+a.substring(1) + " " + b.substring(0,1).toUpperCase()+b.substring(1);
		
		System.out.println(capitalisedConcatenated);
		
		in.close();
	}

}
