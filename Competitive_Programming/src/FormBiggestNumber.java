import java.util.*;
public class FormBiggestNumber {
	public static void main(String args[])
	{
		Scanner rv=new Scanner(System.in);
		int t,q;
		t=rv.nextInt();
		for(q=0;q<t;q=q+1)
		{
			int n;
			n=rv.nextInt();
			int a[]=new int[n];
			int i,j;
			for(i=0;i<n;i=i+1)
				a[i]=rv.nextInt();
			int swap=0;
			String t1="",t2="";
			long x=0,y=0;
			for(i=0;i<n;i=i+1)
			{
				for(j=0;j<n-i-1;j=j+1)
				{
					t1=Integer.toString(a[j])+Integer.toString(a[j+1]);
					t2=Integer.toString(a[j+1])+Integer.toString(a[j]);
					x=Long.parseLong(t1);
					y=Long.parseLong(t2);
					if(x<y)
					{
						swap=a[j];
						a[j]=a[j+1];
						a[j+1]=swap;
					}
				}
			}
			for(i=0;i<n;i=i+1)
			{
				System.out.print(a[i]);
			}
		}
	}
}
