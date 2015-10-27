package counting_nondecreasing;
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
			int[] t=new int[n];
			long count=1;
			
			
			for(int i=0;i<n;i++){
				a[i]=Long.parseLong(x[i]);
				//a[i]=in.nextLong();
				t[i]=1;
				
			}
			for(int i=1;i<n;i++){
				if(a[i]>=a[i-1]){
					t[i]=t[i-1]+1;
				}
				count=count+t[i];
			}
			System.out.println(count);
			
		}
		
	}
	

}
