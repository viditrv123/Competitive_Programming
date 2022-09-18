import java.util.*;
public class Recursion_Pattern {
	public static void main(String args[]) {
		Scanner rv=new Scanner(System.in);
		int n;
		n=rv.nextInt();
		Pattern(n,1,1);
	}
	public static void Pattern(int n, int row, int col) {
		if(row>n) {
			return;
		}
		if(col<=row) {
			System.out.print("* ");
			Pattern(n,row,col+1);
			return;
		}
		System.out.println();
		Pattern(n,row+1,1);

	}
}
