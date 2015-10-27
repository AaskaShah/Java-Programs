package q3_d;
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
				Queue temp1=new Queue(50);int count=1;
				Queue temp2=new Queue(50);//method to reverse left.
				int t=q.dequeue();
				while(t!=d1){
					
					temp1.enqueue(t);
					t=q.dequeue();
				}
				temp2.enqueue(t);
				t=q.dequeue();
				while(t!=d2){
					count++;
					temp2.enqueue(t);
					t=q.dequeue();
				}System.out.println(count);
				temp1.enqueue(t);
				int co=0;
				while(co<count){
					System.out.println("inwhile");
					if(!temp2.isempty()){
						t=temp2.dequeue();
						while(!temp2.isempty()){
							q.enqueue(t);
							t=temp2.dequeue();
						}
						temp1.enqueue(t);
						co++;
					}
					
					if(!q.isempty() && co<count){
						t=q.dequeue();
						while(!q.isempty()){
							temp2.enqueue(t);
							t=q.dequeue();
						}
						temp1.enqueue(t);
						co++;
					}
				}
				while(!q.isempty()){
					temp1.enqueue(q.dequeue());
				}
				while(!temp2.isempty()){
					temp1.enqueue(temp2.dequeue());
				}
				System.out.println("ggfjkag");
				temp1.display();
				//q.display();
				//temp2.display();
				//q.display();
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
