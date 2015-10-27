
public class Stack {
	
	int top;
	int[] stack;
	int maxsize;
	public Stack(int n){
		maxsize=n;
		stack=new int[n];
		top=-1;
	}
	
	public void push(int data){
		if(top==maxsize-1){
			System.out.println("Stack overflow");
		}
		else{
			top++;
			stack[top]=data;
		}
	}
	
	public int pop(){
		if(top==-1){
			System.out.println("Stack underflow");
			return -1;
			
		}
		else{
			int temp=stack[top];
			top--;
			return temp;
		}
	}
	
	public void peek(){
		if(top==-1){
			System.out.println("Stack underflow");
			
		}
		else{
			System.out.println(stack[top]);
			
			
		}
	}
	
	public void display(){
		for(int i=top;i>=0;i--){
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
	public boolean isempty(){
		if(top==-1){
			return true;
		}
		return false;
	}



}
