package codechef_batsmen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int tc=in.nextInt();
		for(int l=0;l<tc;l++){
			ArrayList<Integer> players=new ArrayList<Integer>(11);
			for(int j=0;j<11;j++){
				players.add(in.nextInt());
			}
			int k=in.nextInt();
			Collections.sort(players);
			int last=players.get(11-k);
			int count=0;
			int inthere=0;
			for(int j=0;j<11;j++){
				System.out.print(players.get(j)+"  ");
			}
			for(int j=10;j>=0;j--){
				if(players.get(j)==last){
					if(j>=11-k){
						inthere++;
					}
					count++;
				}
			}
			System.out.println(count+"  "+inthere);
			int ans=1;
		if(count==0)
			ans=1;
		for(int i=1;i<=count;i++){
			ans=ans*i;
		}
		int ansinthere=1;
		if(inthere==0)
			ansinthere=1;
		for(int i=1;i<=inthere;i++){
			ansinthere=ansinthere*i;
		}
		int diff=1;
		if(count-inthere==0)
			diff= 1;
		for(int i=1;i<=count-inthere;i++){
			diff=diff*i;
		}
			int ansfinal=ans/(ansinthere*diff);
			System.out.println(ansfinal);
		}
	}
	
	/*public static int  comb(int n,int k){
		return fact(n)/(fact(k)*fact(n-k));
	}
	
	public static int fact(int n){
		int ans=1;
		if(n==0)
			return 1;
		for(int i=1;i<=n;i++){
			ans=ans*i;
		}
		return ans;
	}*/

}
