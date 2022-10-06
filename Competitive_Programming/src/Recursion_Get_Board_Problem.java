import java.util.*;
public class Recursion_Get_Board_Problem {
	public static void main(String args[]) {
		Scanner rv=new Scanner(System.in);
		ArrayList <String> a=new ArrayList<String>();
		System.out.println(getBoardPermutations("",a).size());
		System.out.println(getBoardPermutations("",a));
		
	}
	public static ArrayList<String> getBoardPermutations(String n, ArrayList<String> a){
		int currentSum=stringValueOf(n);
		if(currentSum==10) {
			a.add(n);
			return a;
		}
		if(currentSum+1<=10) {
			
			a=getBoardPermutations(n+"1", a);
		}
		if(currentSum+2<=10) {
			
			a=getBoardPermutations(n+"2", a);
		}
		if(currentSum+3<=10) {
			
			a=getBoardPermutations(n+"3", a);
		}
		if(currentSum+4<=10) {
			
			a=getBoardPermutations(n+"4", a);
		}
		if(currentSum+5<=10) {
			
			a=getBoardPermutations(n+"5", a);
		}
		if(currentSum+6<=10) {
			
			a=getBoardPermutations(n+"6", a);
		}
		return a;
	}
	public static int stringValueOf(String a) {
		int sum=0;
		if(a.equals("")) {
			return 0;
		}
		for(int i=0;i<a.length();i=i+1) {
			sum=sum+(a.charAt(i) - '0');
		}
		return sum;
	}
}
