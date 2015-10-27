package q9_queues;
import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println("Enter n integers to enqueue");
		Queue q=new Queue(100);
		for(int i=0;i<n;i++){
			q.enqueue(in.nextInt());
		}
		System.out.println("1 x y ..-set according to permutation,2 display 3-dequeue");
		
		while(in.hasNext()){
			int instruction=in.nextInt();
			int data;
			switch(instruction){
			
			case 1:
				int[] per=new int[n];
				for(int i=0;i<n;i++){
					per[i]=in.nextInt();
				}
				Queue temp1=new Queue(50);int count=0;
				Queue temp2=new Queue(50);
				while(!q.isempty()){
					//System.out.println("inwhile");
					int t=q.dequeue();
					if(t==per[count]){
						temp1.enqueue(t);
						count++;
					}
					else{
						q.enqueue(t);
					}
				}
				temp1.display();
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
