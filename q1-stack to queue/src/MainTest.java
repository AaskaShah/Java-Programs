import java.util.Scanner;

public class MainTest {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of queue:");
		int n=in.nextInt();
		QfromStack s=new QfromStack(n);
		System.out.println("1- enqueue 2-dequeue");
		while(in.hasNext()){
			int query=in.nextInt();
			if(query==1){
				int data=in.nextInt();
				s.enqueue(data);
			}
			else{
				int x=s.dequeue();
				if(x!=-1){
					System.out.println(x+" dequeued");
				}
			}
		}
	}

}
