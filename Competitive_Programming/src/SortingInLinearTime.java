import java.util.*;
class SortingInLinearTime {
	public static void main(String args[])
	{
		Scanner rv=new Scanner (System.in);
		int n;
		n=rv.nextInt();
		int i;
		int a[]=new int[n];
		for (i=0;i<n;i=i+1) {
			a[i]=rv.nextInt();
		}
		int mid=0, start=0, end=n-1;
		int swap=0;
		while(mid<=end) {
			if(a[mid]==0)
			{
				swap=a[mid];
				a[mid]=a[start];
				a[start]=swap;
				start=start+1;
			}
			if(a[mid]==2) {
				swap=a[end];
				a[end]=a[mid];
				a[mid]=swap;
				end=end-1;
			}
			else
			{
				mid=mid+1;
			}
			
		}
		for (i=0;i<n;i=i+1)
		{
			System.out.println(a[i]);
		}
	}
}
