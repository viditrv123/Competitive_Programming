import java.util.*;
public class Recursion_Factorial {
	public static void main(String args[]) {
		Scanner rv=new Scanner(System.in);
		long n;
		System.out.println("Enter Number");
		n=rv.nextInt();
		long a=factorial(n);
		System.out.println(a);
	}
	public static long factorial(long n) {
		if(n==1) {
			return 1;
		}
		n=n*factorial(n-1);
		return n;
	}
}
