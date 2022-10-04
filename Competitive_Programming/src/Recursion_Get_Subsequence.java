import java.util.*;
public class Recursion_Get_Subsequence {
	public static void main(String args[]) {
		Scanner rv=new Scanner(System.in);
		String a=new String();
		System.out.println("Enter String");
		a=rv.nextLine();
		System.out.println(getSubstring(a));
	}
	public static ArrayList<String> getSubstring(String a)
	{
		if(a.length()==1) {
			ArrayList<String> b=new ArrayList <String>();
			b.add("");
			b.add(a);
			return b;
		}
		if(a.length()==2) {
			ArrayList<String> b=new ArrayList <String>();
			b.add("");
			b.add(a.charAt(0)+"");
			b.add(a.charAt(1)+"");
			b.add(a);
			return b;
		}
		ArrayList <String> smallSubSeq=getSubstring(a.substring(1));
		int len=smallSubSeq.size();
		for(int i=0;i<len;i=i+1) {
			smallSubSeq.add(a.charAt(0)+smallSubSeq.get(i));
		}
		return smallSubSeq;
	}
}
