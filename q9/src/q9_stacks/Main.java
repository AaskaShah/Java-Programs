package q9_stacks;

import java.util.Scanner;

public class Main {
	

	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of stack and n integrs in it");
		int n=in.nextInt();
		Stack s=new Stack(100);
		for(int i=0;i<n;i++){
			s.push(in.nextInt());
		}
		System.out.println("1 x y ..-permute accordingly,2 display 3-pop");
		
		while(in.hasNext()){
			int instruction=in.nextInt();
			int data;
			switch(instruction){
			case 0:
				s.push(in.nextInt());
				break;
			
			case 1:
				int[] per=new int[n];
				for(int i=0;i<n;i++){
					per[i]=in.nextInt();
				}
				
				Stack temp1=new Stack(50);
				Stack temp2=new Stack(50);
				//permute
				int i=0;
				while(!s.isempty()){
					int t=s.pop();
					while(per[i]!=t && !s.isempty()){
						temp1.push(t);
						t=s.pop();
					}
					temp2.push(t);
					i++;
					while(!temp1.isempty()){
						s.push(temp1.pop());
					}
				}
				s=temp2;
				break;
			case 2:
				s.display();
				break;
			case 3:
				int x=s.pop();
				if(x!=-1){
					System.out.println(x+" popped");
				}
			}	
		}
	}


}
