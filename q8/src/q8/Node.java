package q8;
public class Node {

	
	public int x;
	public Node next;
	public int age;
	public String fname;
	public String lname;
	public int per;
	public Node(int x,int age,String fname,String l,int p){
		this.x=x;
		next=null;
		this.age=age;
		this.fname=fname;
		lname=l;
		per=p;
	}
	
	
	public void displayNode(){
		System.out.println(x+"-"+age+"-"+fname+"-"+lname+"-"+per);
	}

}