package threediffnumbers;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine().trim());
		int[] a=new int[n];
		
		String[] x=in.readLine().trim().split(" ");
		for(int z=0;z<n;z++){
			a[z]=Integer.parseInt(x[z]);
			
		}
		int max=0;int count=0;
		for(int i=0;i<n;i++){
			
			for(int j=i;j<n;j++){
				count=0;
				for(int k=0;k<n;k++){
					if(k<i || k>j){
						if(a[k]==1)
							count++;
					}
					else
					{
						if(a[k]==0)
							count++;
					}
				}
				if(count>max)
					max=count;
			}
		}
		
		
		System.out.println(max);
		
		
	}
}
