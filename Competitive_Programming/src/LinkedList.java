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
		public void getFirst(){
			
		}
		public void getLast(){
			
		}
		public int getElementAtIndex(int x) throws Exception{
			if(x>=size) {
				throw new Exception("Invalid Index");
			}
			if(size==0) {
				throw new Exception("LinkedList with 0 length");
			}
			else {
				int i=0;
				Node temp=new Node();
				temp =head;
				while(i<size) {
					if(i==x) {
						break;
					}
					i=i+1;
					temp=temp.next;
				}
				return temp.data;
			}
		}
		public Node getNodeAtIndex(int x) throws Exception{
			if(x>=size) {
				throw new Exception("Invalid Index");
			}
			if(size==0) {
				throw new Exception("LinkedList with 0 length");
			}
			else {
				int i=0;
				Node temp=new Node();
				temp =head;
				while(i<size) {
					if(i==x) {
						break;
					}
					i=i+1;
					temp=temp.next;
				}
				return temp;
			}
		}
		public void addElementAtIndex(int item, int index) throws Exception{
			Node a=new Node();
			a.data=item;
			if(index>=size) {
				throw new Exception("Invalid Index");
			}
			if(size==0) {
				throw new Exception("LinkedList with 0 length");
			}
			else {
				if(index==0) {
					a.next=head;
					head=a;
				}
				else if(index ==size-1) {
					a.next=null;
					tail=a;
				}else {
					Node temp=head;
					int i=1;
					while(i<index) {
					temp=temp.next;
					i=i+1;
					}
					a.next=temp.next;
					temp.next=a;
				}
			}
		}
		public void removingFirstElement() throws Exception{
			if(size==0) {
				throw new Exception("Empty Linked List");
			}else if(size==1) {
				head=null;
				tail=null;
				size=0;
			}
			else {
			Node temp = new Node();
			temp=head.next;
			head.data=temp.data;
			head.next=temp.next;
			size-=1;
			}
		}
		public void removingLastElement() throws Exception{
			if(size==0) {
				throw new Exception("Empty Linked List");
			}else if(size==1) {
				head=null;
				tail=null;
				size=0;
			}
			else {
			Node temp = new Node();
			temp =head;
			while(temp.next!=tail) {
				temp=temp.next;
			}
			temp.next=null;
			size-=1;
		}
			
		}
		public void removingElementAt(int i) throws Exception{
			if(size==0) {
				throw new Exception("Empty Linked List");
			}else if(size==1) {
				head=null;
				tail=null;
				size=0;
			}
			else {
			Node temp = new Node();
			temp =head;
			int size2=0;
			if(i==0) {
				removingFirstElement();
				return;
			}
			if(i==size-1) {
				removingLastElement();
				return;
			}
			while(size2<i-1) {
				temp=temp.next;
				size2+=1;
			}
			Node temp2=new Node();
			temp2= temp;
			temp2=temp2.next.next;
			temp.next=temp2;
			size-=1;
		}
			
		}
		
		
		public static void main(String args[]) throws Exception{
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
			System.out.println("-------------------------------");
			System.out.println(list1.getElementAtIndex(3));
			System.out.println("-------------------------------");
			System.out.println(list1.getNodeAtIndex(3));
			System.out.println("-------------------------------");
			list1.addElementAtIndex(66,3);
			list1.display();
			System.out.println("-------------------------------");
			LinkedList list2=new LinkedList();
			list2.addIntFirst(5);
			list2.addIntFirst(13);
			list2.addIntFirst(55);
			list2.addIntFirst(9);
			list2.addIntFirst(6);
			list2.display();
			System.out.println("-------------------------------");
			list2.removingFirstElement();
			list2.display();
			System.out.println("-------------------------------");
			list2.removingLastElement();
			list2.display();
			System.out.println("-------------------------------");
			list2.removingElementAt(0);
			list2.display();
		
	}
}
