package q3_b;
import java.util.Scanner;

import q3_a.Stack;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
		System.out.println("0 x->insert,1 x y -exchange between x y,2 display 3-pop");
		Stack s=new Stack(100);
		while(in.hasNext()){
			int instruction=in.nextInt();
			int data;
			switch(instruction){
			case 0:
				s.push(in.nextInt());
				break;
			
			case 1:
				int d1=in.nextInt();int d2=in.nextInt();
				Stack temp1=new Stack(50);
				Stack temp2=new Stack(50);
				int t=s.pop();
				while(t!=d1 && t!=d2){
					
					temp1.push(t);
					t=s.pop();
				}
				temp2.push(t);
				t=s.pop();
				while(t!=d2 && t!=d1){
					
					temp2.push(t);
					t=s.pop();
				}
				temp2.push(t);
				
				
				while(!temp2.isempty()){
					temp1.push(temp2.pop());
				}
				while(!temp1.isempty()){
					s.push(temp1.pop());
				}
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
