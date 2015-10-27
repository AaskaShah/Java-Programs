import java.util.Scanner;
public class MainTest {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of stack:");
		int n=in.nextInt();
		StackfromQ s=new StackfromQ(n);
		System.out.println("1- push 2-pop");
		while(in.hasNext()){
			int query=in.nextInt();
			if(query==1){
				int data=in.nextInt();
				s.push(data);
			}
			else{
				int x=s.pop();
				if(x!=-1){
					System.out.println(x+" poped");
				}
			}
		}
	}

}
