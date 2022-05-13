import java.util.*;
public class BookAllocationProblem {
	public static void main(String args[]) {
		Scanner rv=new Scanner(System.in);
		int t,q;
		t=rv.nextInt();
		for(q=0;q<t;q=q+1) {
			int n,m;
			n=rv.nextInt();
			m=rv.nextInt();
			int a[]=new int[n];
			int i;
			for(i=0;i<n;i=i+1) {
				a[i]=rv.nextInt();
			}
			System.out.println(BinarySearchApplication(a,m));
		}
	}
	public static int BinarySearchApplication(int a[], int m) {
		int low=a[0];
		int i=0,sum=0;
		int ans=0;
		for(i=0;i<a.length;i=i+1) {
			sum+=a[i];
		}
		int up=sum;
		int mid=0;
		while(low<=up) {
			mid=(up+low)/2;
			if(ArraySum(a,mid,m)) {
				up=mid-1;
				ans=mid;
			}
			else
				low=mid+1;
		}
		return ans;
	}
	public static boolean ArraySum(int a[],int limit, int noOfStudents) {
		int i, l=a.length, sum=0;
		int count=1;
		for(i=0;i<l;i=i+1)
		{
			sum+=a[i];
			if(sum>limit) {
				sum=a[i];
				count+=1;
			}
			if(count>noOfStudents)
				return false;
		}
			return true;
	}
}
