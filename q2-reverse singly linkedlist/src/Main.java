import java.util.Scanner;
public class Main {
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		LinkedList l=new LinkedList();
		
		int lsize=0;
		System.out.println("0 x-insert x,1 x-delete x,3-display list 1,5-reverse list");
		while(in.hasNext()){
			int instruction=in.nextInt();
			int data;
			switch(instruction){
			case 0:
				 data=in.nextInt();
				 
				l.insert(data);
				lsize++;
				break;
			case 1:
				 data=in.nextInt();
				l.delete(data);
				break;
			
			case 3:
				l.displaylist();
				break;
			
			case 5:
				l.reverse();
			}
		}
	}

}
