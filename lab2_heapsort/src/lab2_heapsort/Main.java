package lab2_heapsort;

import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=in.nextInt();
		System.out.println("Enter elements of array");
		int[] a=new int[n+1];
		
		for(int i=1;i<n+1;i++){
			a[i]=in.nextInt();
			
		}
		HeapSort c=new HeapSort(a);
		System.out.println("1-heapsort");
		int query=in.nextInt();
		if(query==1){
			c.heapsort();
			
		}
	}

}
