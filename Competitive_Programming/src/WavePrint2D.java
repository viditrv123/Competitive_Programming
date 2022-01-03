//Wave Print
import java.util.*;
public class WavePrint2D {

	public static void main(String[] args) {
		Scanner rv=new Scanner(System.in);
		int n,m,i;
		n=rv.nextInt();
		m=rv.nextInt();
		int a[][]=new int[n][m];
		int j;
		for(i=0;i<n;i=i+1)
		{
			for(j=0;j<m;j=j+1)
			{
				a[i][j]=rv.nextInt();
			}
		}
		i=0;j=0;
		while(i<m)
		{
			for(j=0;j<n;j=j+1)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			i=i+1;
			for(j=n-1;j>=0&&i<m;j=j-1)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			i=i+1;
		}
		
	}

}
