import java.util.*;
public class MaximumSubArraySum {
	public static void main(String args[])
	{
		Scanner rv=new Scanner(System.in);
		int t,q;
		t=rv.nextInt();
		for(q=0;q<t;q=q+1) {
			int n;
			n=rv.nextInt();
			int a[]=new int[n];
			int i;
			for(i=0;i<n;i=i+1)
				a[i]=rv.nextInt();
			
			System.out.println(MaximumCircularSum(a));
		}
		
	}
	public static long MaximumCircularSum(int arr[]) {
		int i;
		long withoutWrappingSum=KadaneAlgo(arr);
		
		return withoutWrappingSum;
	}
	public static long KadaneAlgo(int arr[]) {
		int i;
		long maxSum=0,sum=0;
		for(i=0;i<arr.length;i=i+1) {
			sum+=arr[i];
			if(sum<0) {
				sum=0;
			}
			if(maxSum<sum)
				maxSum=sum;
		}
		return maxSum;
	}
}
