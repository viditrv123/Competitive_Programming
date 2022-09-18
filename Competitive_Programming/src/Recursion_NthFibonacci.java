import java.util.*;
public class Recursion_NthFibonacci {
	public static void main(String args[]) {
		Scanner rv=new Scanner(System.in);
		System.out.println("Enter N");
		int n;
		n=rv.nextInt();
		long NthFibonacci=Fibonacci(n);
		System.out.println(NthFibonacci);
	}
	public static long Fibonacci(int n){
		if(n==1)
		{
			return 0;
		}
		if (n==2) {
			return 1;
		}
		long sum =0;
		sum =sum+ Fibonacci(n-1) +Fibonacci(n-2);
		return sum;
	}
}
