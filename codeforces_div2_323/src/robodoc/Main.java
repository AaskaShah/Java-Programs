package robodoc;
import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine().trim());
		int[] a=new int[n];
		String[] x=in.readLine().trim().split(" ");
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(x[i]);
		}
		int info=0;
		int change=0;
		while(true){
			for(int i=0;i<n;i++){
				if(a[i]!=-1 && a[i]<=info){
					a[i]=-1;
					info++;
					
				}
			}
			
			if(isallminus1(a)){
				break;
			}
			else
				change++;
			for(int i=n-1;i>=0;i--){
				if(a[i]!=-1 && a[i]<=info){
					a[i]=-1;
					info++;
					
				}
			}
			if(isallminus1(a)){
				break;
			}
			else
				change++;
		}
		
		System.out.println(change);
		
	}
	
	static boolean isallminus1(int[] a){
		boolean ans=true;
		for(int i=0;i<a.length;i++){
			if(a[i]!=-1)
				ans=false;
		}
		return ans;
	}

}
