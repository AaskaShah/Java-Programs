package q3_c;

public class Queue {
	public int size;
	int front;int rear;
	int maxsize;
	public int q[];
	public Queue(int n){
		q=new int[n];
		size=0;maxsize=n;front=-1;rear=-1;
	}
	
	public void enqueue(int data){
		if(size==0)
			front++;
		rear=(rear+1)%maxsize;
		q[rear]=data;
		size++;
		
	}
	
	public int dequeue(){
		int x=q[front];
		if(front==rear)
			front=rear=-1;
		else
		front=(front+1)%maxsize;
		size--;
		return x;
	}
	public void display(){
		int f=front;
		int r=rear;
		while(f!=r){
			System.out.print(q[f]+" ");
			f=(f+1)%maxsize;
		}
		System.out.println(q[f]+" ");
		System.out.println();
	}
	public boolean isempty(){
		if(size==0)return true;
		else
			return false;
	}

}
