package flipping_game;
import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine().trim());
		int[] a=new int[n];
		int[][] t=new int[n][n];
		String[] x=in.readLine().trim().split(" ");
		for(int z=0;z<n;z++){
			a[z]=Integer.parseInt(x[z]);
			t[z][z]=1-a[z];
		}
		
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				t[i][j]=t[i][j-1];
				if(a[j]==0)
					t[i][j]++;
			}
		}
		/*for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}*/
		int max=0;
		int l=-1,r=-1;
		for(int i=0;i<n;i++){
			for(int j=n-1;j>-1;j--){
				if(t[i][j]>=max){
					max=t[i][j];
					l=i;
					r=j;
				}
			}
		}
		//System.out.println(l+" "+r+" "+max);
		for(int i=0;i<l;i++){
			if(a[i]==1)
				max++;
		}
		for(int i=r+1;i<n;i++){
			if(a[i]==1)
				max++;
		}
		System.out.println(max);
	}

}
