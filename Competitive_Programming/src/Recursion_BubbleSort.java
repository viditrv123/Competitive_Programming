import java.util.*;
public class Recursion_BubbleSort {
	public static void main(String args[]) {
		Scanner rv=new Scanner(System.in);
		System.out.println("Enter Length");
		int n;
		n=rv.nextInt();
		System.out.println("Enter Array");
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i=i+1) {
			a[i]=rv.nextInt();
		}
		SortedArray(a,0,0);
	}
	public static void SortedArray(int a[],int start, int end) {
		if(start>=a.length-1) {
			for(int i=0;i<a.length;i=i+1) {
				System.out.print(a[i]+" ");
			}
			return;
		}
		if(end<a.length-1-start) {
			if(a[end]>a[end+1]) {
				int t;
				t=a[end];
				a[end]=a[end+1];
				a[end+1]=t;
			}
			SortedArray(a,start, end+1);
			return;
		}
		SortedArray(a,start+1, 0);
	}
}
