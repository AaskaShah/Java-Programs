package q10;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of stack:");
		int n=in.nextInt();
		DataList s=new DataList(n);
		System.out.println("1-insert 2-delete");
		while(in.hasNext()){
			int query=in.nextInt();
			if(query==1){
				int data=in.nextInt();
				s.insert(data);
			}
			else{
				int x=s.delete();
				if(x!=-1){
					System.out.println(x+" deleted");
				}
			}
		}
	}

}
