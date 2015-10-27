import java.util.Scanner;
public class Main {
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int tc=Integer.parseInt(in.nextLine());
		for(int k=0;k<tc;k++){
			int flag=0;
			int lvl=Integer.parseInt(in.nextLine());
			String[] x=in.nextLine().split(" ");
			int leaves=Integer.parseInt(x[0]);
			int stem=1-leaves;
			for(int l=2;l<=lvl;l++){
				leaves=Integer.parseInt(x[l-1]);
				if(l==lvl && leaves!=stem*l){
					System.out.println("No");
					flag=1;
					break;
				}
				if(leaves>stem*l){
					System.out.println("No");
					flag=1;
					break;
				}
				stem=l-leaves;
			}
			if(flag==0)
				System.out.println("Yes");
		}
	}

}
