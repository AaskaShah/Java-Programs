package lab2_q7;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter diamension of the matrix:");
		int n=in.nextInt();
		int[][] a=new int[n][n];
		System.out.println("Enter elements of matrix");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=in.nextInt();
			}
		}
		Matrix_search m=new Matrix_search(a);
		System.out.println("1 x ->search x in matrix");
		while(in.hasNext()){
			int query=in.nextInt();
			if(query==1){
				int key=in.nextInt();
				m.search(key);
			}
		}
	}
}
