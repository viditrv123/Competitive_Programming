import java.util.*;
public class Recursion_FirstIndex {
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
		System.out.println("Enter Number to find");
		int x;
		x=rv.nextInt();
		int m=firstIndex(a,x,0);
		String ans= m==-1?"Number not present":"Number present at "+m;
		System.out.println(ans);
	}
	public static int firstIndex(int a[],int x, int i) {
		if(i>a.length-1) {
			return -1;
		}
		if(a[i]==x) {
			return i;
		}
		return firstIndex(a,x,i+1);
	}

}
