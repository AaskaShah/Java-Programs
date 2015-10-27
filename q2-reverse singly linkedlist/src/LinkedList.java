public class LinkedList {
	
	Node head;
	
	int size=0;
	public LinkedList(){
		head=null;
	}
	
	public void insert(int x){
		Node temp=new Node(x);
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
	
	
	public void delete(int data){
		
		int index=0;
		int found=0;
		while(head.x==data){
			if(size==1){
				head=null;
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
	
	public void reverse(){
		if(size==1){
			return;
		}
		reverselink(head,head.next);
	}
	
	public void reverselink(Node a,Node b){
		if(b==null){
			head=a;
			return;
		}
		reverselink(a.next,b.next);
		b.next=a;
		a.next=null;
	}


}