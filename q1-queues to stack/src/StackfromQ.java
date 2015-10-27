
public class StackfromQ {
	
	int top;
	int maxsize;
	int[] s;
	Queue q1;
	Queue q2;
	public StackfromQ(int n){
		maxsize=n;
		q1=new Queue(n);
		q2=new Queue(n);
		top=-1;
	}
	
	public void push(int data){
		if(top==maxsize-1){
			System.out.println("Stack overflow");
		}
		else{
			q1.enqueue(data);
			top++;
		}
	}
	
	public int pop(){
		if(q1.isempty()){
			System.out.println("Stack underflow");
			return -1;
		}
		for(int i=0;i<top;i++){
			q2.enqueue(q1.dequeue());
		}
		
		int x=q1.dequeue();
		top--;
		Queue temp=q1;
		q1=q2;
		q2=temp;
		return x;
	}

}
