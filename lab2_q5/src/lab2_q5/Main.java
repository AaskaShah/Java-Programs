package lab2_q5;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=in.nextInt();
		System.out.println("Enter elements of array");
		int[] a=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
			
		}
		SecondMin c=new SecondMin(a);
		System.out.println("1-find second minimum");
		int query=in.nextInt();
		if(query==1){
			c.secondmin();
			
		}
	}

}
