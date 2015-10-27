import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int zeros=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
			if(a[i]==0)
				zeros++;
		}
		if(zeros==n){
			System.out.println("0");
			return;
		}
		int maxlength=1;
		int[][] table =new int[n][n];
		for(int i=0;i<n;i++){
			if(a[i]!=0){
				table[i][i]=1;
			}
		}
		
		for(int i=0;i<n-1;i++){
			if(a[i]!=0 && a[i+1]!=0){
				table[i][i+1]=1;
				maxlength=2;
			}
		}
		
		for(int l=3;l<=n;l++){
			for(int i=0;i<n-l+1;i++){
				int j=i+l-1;
				if(a[i]!=0 && a[j]!=0 && table[i+1][j-1]==1){
					maxlength=l;
					table[i][j]=1;
				}
			}
		}
		
		System.out.println(maxlength);
		
	}
}
