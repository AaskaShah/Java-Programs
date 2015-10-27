package q10;

public class DataList {
	int size;
	int maxsize;
	int[] s;
	Queue q1;
	Queue q2;
	public DataList(int n){
		maxsize=n;
		q1=new Queue(n);
		q2=new Queue(n);
		size=0;
	}
	
	public void insert(int data){
		if(size==maxsize){
			System.out.println("DataList overflow");
		}
		else{
			q1.enqueue(data);
			size++;
		}
	}
	
	public int delete(){
		if(q1.isempty()){
			System.out.println("Stack underflow");
			return -1;
		}
		if(size<=8){
			int x=q1.dequeue();
			size--;
			return x;
		}
		else{
		for(int i=0;i<size-1;i++){
			q2.enqueue(q1.dequeue());
		}
		
		int x=q1.dequeue();
		size--;
		Queue temp=q1;
		q1=q2;
		q2=temp;
		return x;
		}
	}


}
