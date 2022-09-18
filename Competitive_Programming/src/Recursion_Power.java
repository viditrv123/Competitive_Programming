import java.util.*;
public class Recursion_Power {
	public static void main(String args[]) {
		Scanner rv=new Scanner(System.in);
		System.out.println("Enter number and pow");
		long num;
		int pow;
		num=rv.nextLong();
		pow=rv.nextInt();
		System.out.println(power(num,pow));
	}
	public static long power(long num, int pow) {
		if(pow==1) {
			return num;
		}
		num = num*power(num,pow-1);
		return num;
	}
}
