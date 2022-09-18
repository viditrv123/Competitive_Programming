import java.util.*;
public class Recursion_IsArraySorted {
	public static void main(String args[]) {
		Scanner rv=new Scanner(System.in);
		System.out.println("Enter Length");
		int n;
		n=rv.nextInt();
		System.out.println("Enter Array");
		int a[]=new int [n];
		int i;
		for(i=0;i<n;i=i+1) {
			a[i]=rv.nextInt();
		}
		System.out.println("IsArraySorted "+isArraySorted(a,0));
	}
	public static boolean isArraySorted(int a[], int i) {
		if(i==a.length-1) {
			return true;
		}
		if(a[i]>a[i+1]) {
			return false;
		}
		boolean ans=isArraySorted(a, i+1);
		return ans;
	}
}
