package q11;
import java.util.Scanner;

public class Main {
	public static Stack stack[]=new Stack[4];
	

	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of stack and n integrs in stack a");
		int n=in.nextInt();
		stack[1]=new Stack(100);
		for(int i=0;i<n;i++){
			stack[1].push(in.nextInt());
		}
		System.out.println("1..-transfering element to stack b,2- display stack c ,3-pop,4-display initial stack");
		
		while(in.hasNext()){
			int instruction=in.nextInt();
			int data;
			switch(instruction){
		
			case 1:
				stack[2]=new Stack(100);
				stack[3]=new Stack(100);
				toh(n);
				//permute
				
				break;
			case 2:
				stack[3].display();
				break;
			case 3:
				int x=stack[3].pop();
				if(x!=-1){
					System.out.println(x+" popped");
				}
				break;
			case 4:
				stack[1].display();
				break;
			}	
		}
	}

	public static void toh(int n){
		move(n,1,2,3);
	}
	
	public static void move(int n,int a,int b,int c){
		if(n>0){
			move(n-1,a,c,b);
			int x=stack[a].pop();
			stack[c].push(x);
			move(n-1,b,a,c);
		}
	}

}
