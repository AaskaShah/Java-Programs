package q5;

public class Node {

	
	public int x;
	public Node next;
	public int data2;
	public Node(int x,int dum){
		this.x=x;
		next=null;
		data2=dum;
	}
	
	
	public void displayNode(){
		System.out.println(x+"-"+data2);
	}

}