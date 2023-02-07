import java.util.*;
public class GenericTree {
	public class Node{
		int data;
		ArrayList <Node> children;
		Node(int data){
			this.data=data;
			this.children=new ArrayList<Node>();
		}
	}
	
	private Node root;
	private int size;
	
	GenericTree(){
		Scanner rv=new Scanner(System.in);
		this.root=takeInput(rv, null, 0);
	}
	
	private Node takeInput(Scanner rv, Node parent, int ithChild) {
		if(this.root==null) {
			System.out.println("Enter data for root node");
			
		}
		else {
			System.out.println("Enter data for the "+ithChild+"th child of "+parent.data);
		}
		int nodeData=rv.nextInt();
		Node obj=new Node(nodeData);
		this.size++;
		System.out.println("Enter no. of children for "+obj.data);
		int children = rv.nextInt();
		for(int i=0;i<children;i=i+1) {
			Node child=this.takeInput(rv, obj, i);
			obj.children.add(child);
		}
		return obj;
	}
	
}
