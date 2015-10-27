package q3_c;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
		System.out.println("0 x->enqueue,1 x y -exchange between x y,2 display 3-dequeue");
		Queue q=new Queue(100);
		while(in.hasNext()){
			int instruction=in.nextInt();
			int data;
			switch(instruction){
			case 0:
				q.enqueue(in.nextInt());
				break;
			
			case 1:
				int d1=in.nextInt();int d2=in.nextInt();
				Queue temp1=new Queue(50);
				Queue temp2=new Queue(50);
				int t=q.dequeue();
				while(t!=d1 && t!=d2){
					
					temp1.enqueue(t);
					t=q.dequeue();
				}
				temp2.enqueue(t);
				t=q.dequeue();
				while(t!=d2 && t!=d1){
					
					temp2.enqueue(t);
					t=q.dequeue();
				}
				temp1.enqueue(t);
				q.enqueue(temp2.dequeue());
				
				while(!temp2.isempty()){
					temp1.enqueue(temp2.dequeue());
				}
				t=q.dequeue();
				while(t!=d1 && t!=d2){
					temp2.enqueue(t);
					t=q.dequeue();
				}
				temp1.enqueue(t);
				while(!temp2.isempty()){
					temp1.enqueue(temp2.dequeue());
				}
				q=temp1;
				break;
			case 2:
				q.display();
				break;
			case 3:
				int x=q.dequeue();
				if(x!=-1){
					System.out.println(x+" dequeued");
				}
			}	
		}
	}

}
