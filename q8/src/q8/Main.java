package q8;

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
				in.nextLine();
				 String[] line=in.nextLine().split(" ");
				 
				l.insert(Integer.parseInt(line[0]),Integer.parseInt(line[1]),line[2],line[3],Integer.parseInt(line[4]));
				lsize++;
				break;
			case 1:
				 data=in.nextInt();
				l.delete(data);
				break;
			case 2:
				in.nextLine();
				 line=in.nextLine().split(" ");
				 Node[] n;
				n=l.makedup(Integer.parseInt(line[0]),Integer.parseInt(line[1]),line[2],line[3],Integer.parseInt(line[4]));
				for(int i=0;n[i]!=null;i++){
					l2.insert(n[i].x,n[i].age,n[i].fname,n[i].lname,n[i].per);
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