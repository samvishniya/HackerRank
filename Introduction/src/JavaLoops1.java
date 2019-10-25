import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/* Task
 * Given an integer n, , print its first n multiples. 
 * Each multiple  (where 1<= i<=10 ) should be printed on a new line in the form: N x i = result.
 * 
 */
public class JavaLoops1 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		
		for ( int i=1;i<=10; i++) {
			System.out.print(N + " x " + i + " = ");
			System.out.println(N*i);
			
		}
		 
		

		scanner.close();

	}
}
