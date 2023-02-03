import java.util.*;
public class LinkedList {
		private class Node {
			int data;
			Node next;
		}
		Scanner rv=new Scanner(System.in);
		private Node head;
		private Node tail;
		private int size=0;
		
		public void display(){
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		public void addIntLast(int item){
			Node newData=new Node();
			newData.data=item;
			newData.next=null;
			if(size==0) {
				head=newData;
				tail=newData;
				size ++;
			}else {
				tail.next=newData;
				tail=newData;
				size++;
			}
		}
		
		public void addIntFirst(int item){
			Node newData=new Node();
			newData.data=item;
			newData.next=head;
			if(size==0) {
				head=newData;
				tail=newData;
				size ++;
			}else {
				head=newData;
				size++;
			}
		}
		public static void main(String args[]) {
			LinkedList list = new LinkedList();
			list.addIntLast(5);
			list.addIntLast(13);
			list.addIntLast(55);
			list.addIntLast(9);
			list.addIntLast(6);
			list.display();
			System.out.println("-------------------------------");
			LinkedList list1 = new LinkedList();
			list1.addIntFirst(5);
			list1.addIntFirst(13);
			list1.addIntFirst(55);
			list1.addIntFirst(9);
			list1.addIntFirst(6);
			list1.display();
		
	}
}
