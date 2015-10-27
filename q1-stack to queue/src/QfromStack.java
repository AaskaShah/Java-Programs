

public class QfromStack {
	int maxsize=0;
	int count=0;
	Stack stack1;
	Stack stack2;
	public QfromStack(int n){
		maxsize=n;
		stack1=new Stack(n);
		stack2=new Stack(n);
	}
	
	public void enqueue(int val){
		if(count<maxsize){
			stack1.push(val);
			count++;
		}
		else
		{
			System.out.println("queue overflow");
		}
	}
	
	public int dequeue(){
		if(count>0){
			int temp;
			for(int i=0;i<count;i++){
				stack2.push(stack1.pop());
			}
			temp=stack2.pop();
			count--;
			for(int i=0;i<count;i++){
				stack1.push(stack2.pop());
			}
			return temp;
		}
		else
		{
			System.out.println("Queue underflow");
			return -1;
		}
	}
	
	public void display(){
		stack1.display();
	}
	
	

}


