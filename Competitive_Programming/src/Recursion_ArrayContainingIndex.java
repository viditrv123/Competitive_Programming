import java.util.Scanner;
public class Recursion_ArrayContainingIndex {
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
		System.out.println("Enter Number who index needs to be found");
		int x;
		x=rv.nextInt();
		int ans[]=ArrayContainingIndex(a,x,0,0);
		for( i=0;i<ans.length;i=i+1) {
			System.out.print(ans[i]+" ");
		}
	}
	public static int[] ArrayContainingIndex(int a[],int x,int i, int length) {
		if(i>=a.length) {
			int ans[]=new int[length];
			return ans;
		}
		if(a[i]==x) {
			length++;
			int ans[]=ArrayContainingIndex(a,x,i+1,length);
			ans[length-1]=i;
			return ans;
		}
		int ans[]=ArrayContainingIndex(a,x,i+1,length);
		return ans;
		
	}

}
