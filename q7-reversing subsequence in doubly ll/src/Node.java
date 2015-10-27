
public class Node {
	public int x;
	public Node next;
	public Node prev;
	public Node(int x){
		this.x=x;
		next=null;
		prev=null;
	}
	
	
	public void displayNode(){
		System.out.println(x);
	}


}
