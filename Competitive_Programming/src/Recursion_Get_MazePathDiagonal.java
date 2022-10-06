import java.util.ArrayList;
import java.util.Scanner;
public class Recursion_Get_MazePathDiagonal {
	public static void main(String args[]) {
		Scanner rv=new Scanner(System.in);
		ArrayList<String> a=new ArrayList<String>();
		System.out.println(getMazePath("",a,0,0));
	}
	public static ArrayList<String> getMazePath(String n, ArrayList<String> a, int x, int y){
		if (x==2 && y==2) {
			a.add(n);
			return a;
		}
		if(x<2) {
			a=getMazePath(n+"H", a, x+1, y);
		}
		if(y<2) {
			a=getMazePath(n+"V", a, x, y+1);
		}
		if(y<2&&x<2) {
			a=getMazePath(n+"D", a, x+1, y+1);
		}
		return a;
	}
}
