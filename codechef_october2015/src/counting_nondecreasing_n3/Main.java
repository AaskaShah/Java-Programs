package counting_nondecreasing_n3;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args)throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine().trim());
		//Scanner in=new Scanner(System.in);
		//int tc=in.nextInt();
		for(int z=0;z<tc;z++){
			int n=Integer.parseInt(in.readLine().trim());
			//int n=in.nextInt();
			long[] a=new long[n+1];
			String[] x=in.readLine().trim().split(" ");
			
			long[] t=new long[n+1];
			for(int i=0;i<n;i++){
				a[i]=Long.parseLong(x[i]);
				//a[i]=in.nextLong();
				t[i]=1;
				
			}
			
			for(int i=1;i<n;i++){
				t[i]=t[i]+t[i-1];
				if(a[i]>=a[i-1]){
					t[i]++;
				}
				
			}
			System.out.println(t[n-1]);
			
		}
		
	}
	

}
