package q8;


public class LinkedList {
	
	Node head;
	int size=0;
	public LinkedList(){
		head=null;
	}
	
	public void insert(int x,int age,String f,String l,int p){
		Node temp=new Node(x,age,f,l,p);
		Node curr=head;
		if(head==null){
			head=temp;
		}
		else{
		while(curr.next!=null){
			curr=curr.next;
			//System.out.println("inwhile");

		}
		curr.next=temp;
		}
		size++;
	}
	
	public Node[] makedup(int data,int age,String f,String l,int p){
		Node curr=head;
		int found=0;
		int index=0;
		Node[] n=new Node[size];
		/*if(head.x==data){
			System.out.println(data+" is at position "+index);
			found=1;
		}*/
		int co=0;
		while(curr!=null){
			int count=0;
			//curr.displayNode();
			if(curr.x==data){
				count++;
			}
			if(curr.age==age){
				count++;
			}
			if(curr.fname.equals(f)){
				count++;
			}
			if(curr.lname.equals(l)){
				count++;
			}
			if(curr.per==p){
				count++;
			}

			if(count>=3){
				n[co]=curr;
				found=1;
				co++;
			}
			curr=curr.next;
			index++;
		}
		
		if(found==0){
			System.out.println("This element is not in list");
		}
		return n;
	}
	
	public void delete(int data){
		
		int index=0;
		int found=0;
		while(head!=null && head.x==data){
			if(size==1){
				head=null;
				found=1;
				size=0;
			}
			else{
				head=head.next;
				size--;
			}
		}
		Node curr=head;
		while(curr!=null && curr.next!=null){
			
			if(curr.next.x==data){
				
				curr.next=curr.next.next;
				found=1;
				size--;
			}
			curr=curr.next;
		}
		if(found==0){
			System.out.println("This element does not exist");
		}
	}
	
	public void displaylist(){
		Node curr=head;
		while(curr!=null){
			curr.displayNode();
			curr=curr.next;
		}
	}


}