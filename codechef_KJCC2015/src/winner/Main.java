package winner;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int tc=in.nextInt();
		
		for(int z=0;z<tc;z++){
			int n=in.nextInt();
			int p=in.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=1;
			}
			int counter=p;
			while(onlyoneleft(a)==-1){
				
				a[counter]=0;
				System.out.println(counter);
				counter+=2;
				if(counter==n)
					counter=0;
				else if(counter==n+1)
					counter=1;
			}
			System.out.println(onlyoneleft(a)+1);
		}
	}


	static int onlyoneleft(int[] a){
		int nonzero=-1;
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]!=0)
				nonzero=i;
			else
				count++;
		}
		if(count==a.length-1)
			return nonzero;
		else
			return -1;
	}
} 
