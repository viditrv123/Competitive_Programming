import java.util.*;
public class Recursion_PDISkip {
	public static void main(String args[]) {
		Scanner rv=new Scanner(System.in);
		System.out.println("Enter number");
		int n;
		n=rv.nextInt();
		PDISkip(n);
	}
	public static void PDISkip(int n) {
		if(n==0) {
			return;
		}
		if(n%2==1) {
			System.out.println(n);
		}
		PDISkip(n-1);
		
		if(n%2==0) {
			System.out.println(n);
		}
	}
}
