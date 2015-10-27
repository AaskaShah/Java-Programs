package Edit_Distance;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine().trim());
		
		for(int z=0;z<tc;z++){
			String a=in.readLine();
			String b=in.readLine();
			int[][] t=new int[a.length()+1][b.length()+1];
			int m=a.length();
			int n=b.length();
			for(int i=0;i<m+1;i++){
				for(int j=0;j<n+1;j++){
					t[i][j]=-1;
				}
			}
			for(int i=0;i<a.length()+1;i++){
				t[i][0]=i;
			}
			for(int i=0;i<b.length()+1;i++){
				t[0][i]=i;
			}
			for(int i=0;i<m+1;i++){
				for(int j=0;j<n+1;j++){
					System.out.print(t[i][j]+" ");
				}
				System.out.println();
			}
			for(int i=1;i<m+1;i++){
				for(int j=1;j<n+1;j++){
					if(a.charAt(i-1)==b.charAt(j-1))
						t[i][j]=t[i-1][j-1];
					else{
					int l=t[i][j-1]+1;
					int r=t[i-1][j]+1;
					int c=t[i-1][j-1]+1;
					
					t[i][j]=Math.min(Math.min(l, r), c);
					}
				}
			}
			for(int i=0;i<m+1;i++){
				for(int j=0;j<n+1;j++){
					System.out.print(t[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println(t[m][n]);
		}
		
		
	}
}
