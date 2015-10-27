package q5;

import java.util.Scanner;
public class Main {

	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		LinkedList l=new LinkedList();
		LinkedList l2=new LinkedList();
		int lsize=0;
		System.out.println("0 -insert,1-delete,2-make dup list,3-display list 1,4-display dup list.");
		while(in.hasNext()){
			int instruction=in.nextInt();
			int data;
			switch(instruction){
			case 0:
				 data=in.nextInt();
				 int dum=in.nextInt();
				l.insert(data,dum);
				lsize++;
				break;
			case 1:
				 data=in.nextInt();
				l.delete(data);
				break;
			case 2:
				 data=in.nextInt();
				 Node[] n;
				n=l.search(data);
				for(int i=0;n[i]!=null;i++){
					l2.insert(n[i].x,n[i].data2);
				}
				break;
			case 3:
				l.displaylist();
				break;
			case 4:
				l2.displaylist();
				break;
			}
		}
	}
}