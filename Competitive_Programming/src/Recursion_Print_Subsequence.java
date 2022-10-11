import java.util.*;
public class Recursion_Print_Subsequence {
	public static void main (String args[]) {
		Scanner rv=new Scanner(System.in);
		String a=new String();
		System.out.println("Enter the String");
		a=rv.nextLine();
		printSubSequence(a, "");
		
	}
	public static void printSubSequence(String a, String b) {
		if(a.equals("")) {
			System.out.print(b+" ");
			return ;
		}
		char x=a.charAt(0);
		a=a.length()==1?"":a.substring(1);
		printSubSequence(a,b+Character.toString(x));
		printSubSequence(a,b);
		return ;
	}
}
