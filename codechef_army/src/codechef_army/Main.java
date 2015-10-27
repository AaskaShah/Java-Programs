package codechef_army;
import java.util.*;
public class Main {
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int tc=in.nextInt();
		for(int z=0;z<tc;z++){
			int n=in.nextInt();
			int m=in.nextInt();
			
			int k=in.nextInt();
			int maxm=k;int minm=k;
			for(int i=1;i<m;i++){
				 k=in.nextInt();
				if(k>maxm)
					maxm=k;
				if(k<minm)
				minm=k;
				
			}
			for(int i=0;i<n;i++)
			System.out.print(Math.max(Math.abs(maxm-i), Math.abs(minm-i))+" ");
			System.out.println();
		}
	}

}
