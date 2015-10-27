package manyLists;
import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		//List<List<Integer>> s=new ArrayList<List<Integer>>();
		ArrayList[] s=new ArrayList[n];
		for(int i=0;i<n;i++){
			s[i]=new ArrayList<Integer>();
			s[i].add(0);
		}
		for(int z=0;z<m;z++){
			int query=in.nextInt();
			if(query==0){
				
				int l=in.nextInt();int r=in.nextInt();int x=in.nextInt();
				for(int i=l-1;i<r;i++){
					if(!s[i].contains(x)){
						s[i].add(x);
					}
				}
			}
			else if(query==1){
				int index=in.nextInt();
				System.out.println(s[index-1].size()-1);
			}
			
		}
	}

}
