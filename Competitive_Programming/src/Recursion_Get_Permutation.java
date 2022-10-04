import java.util.*;
public class Recursion_Get_Permutation {
	public static void main(String args[]) {
		Scanner rv=new Scanner(System.in);
		String a=new String();
		System.out.println("Enter String");
		a=rv.nextLine();
		System.out.println(getPermutation(a));
	}
	public static ArrayList<String> getPermutation(String a){
		if(a.length()==1) {
			ArrayList <String> b=new ArrayList<String>();
			b.add(a);
			return b;
		}
		if(a.length()==2) {
			ArrayList <String> b=new ArrayList<String>();
			b.add(a);
			String d= ((char)a.charAt(1))+""+((char)a.charAt(0));
			System.out.println(d);
			b.add(d);
			return b;
		}
		ArrayList <String> b=getPermutation(a.substring(1));
		ArrayList <String> c=new ArrayList<String>();
		int len=b.size();
		for(int j=0;j<len;j=j+1) {
			for(int i=0;i<b.get(j).length()+1;i=i+1) {
				String str= b.get(j).substring(0,i)+a.charAt(0)+b.get(j).substring(i);
				c.add(str);
			}
		}
		return c;
	}
}
