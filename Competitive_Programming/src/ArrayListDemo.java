import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>();
		// adding element in  Arraylist
		a.add(1);
		System.out.println(a);
		// lemgth of ArrayList
		System.out.println(a.size());
		// to get element in a particular index
		System.out.println(a.get(0));
		// remove an element in the ArrayList at a particular index
		a.remove(0);
		System.out.println(a);
		
	}

}
