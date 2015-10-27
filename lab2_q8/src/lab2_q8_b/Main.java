package lab2_q8_b;

import java.util.Scanner;


public class Main {
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=in.nextInt();
		System.out.println("Enter elements of array in range 0 to 9");
		int[] a=new int[n];
		int k=9;
		
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
			
		}
		Counting c=new Counting(a);
		System.out.println("1-countingsort according to b");
		int query=in.nextInt();
		if(query==1){
			c.countingsort_b();
			
		}
	}

}
