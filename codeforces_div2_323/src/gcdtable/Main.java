package gcdtable;
import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] x=in.readLine().trim().split(" ");
		int n=Integer.parseInt(x[0]);
		int t=Integer.parseInt(x[1]);
		int count=0;
		
		int[] a=new int[n*t];
		int dp[]=new int[n];
		x=in.readLine().trim().split(" ");
		for(int i=0;i<n*t;i++){
			if(i<n)
				a[i]=Integer.parseInt(x[i]);
			else{
				a[n*(i/n)]=a[i%n];
			}
			
		}
		for(int i=1;i<n*t;i++){
			
			dp[i]=dp[i-1];
			if(a[i]>a[i-1])
				dp[i]++;
			else{
				dp[i]=0;
			}
		}
		
		System.out.println();
	}

}
