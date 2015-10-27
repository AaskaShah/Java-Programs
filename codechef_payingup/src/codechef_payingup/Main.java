package codechef_payingup;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int tc=in.nextInt();
		for(int z=0;z<tc;z++){
			int n=in.nextInt();
			int m=in.nextInt();
			
			int[] notes=new int[n];
			for(int i=0;i<n;i++){
				notes[i]=in.nextInt();
				
			}
			boolean[][] subset=new boolean[m+1][n+1];
			for(int i=0;i<=n;i++){
				subset[0][i]=true;
			}
			for(int i=1;i<=m;i++){
				subset[i][0]=false;
			}
			for(int i=1;i<=m;i++){
				for(int j=1;j<=n;j++){
					subset[i][j]=subset[i][j-1];
					if(i>=notes[j-1]){
						subset[i][j]=subset[i][j] || subset[i-notes[j-1]][j-1];
					}
				}
			}
		/*	for (int i = 0; i <= m; i++)
			{
			for (int j = 0; j <= n; j++)
				System.out.printf (subset[i][j]+" ");
			System.out.printf("\n");
			} */
			if(subset[m][n]==true)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
