import java.util.Scanner;
public class Recursion_LastIndex {
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
		int m=lastIndex(a,x,n-1);
		String ans= m==-1?"Number not present":"Number present at "+m;
		System.out.println(ans);
	}
	public static int lastIndex(int a[],int x, int i) {
		if(i<0) {
			return -1;
		}
		if(a[i]==x) {
			return i;
		}
		return lastIndex(a,x,i-1);
	}

}
