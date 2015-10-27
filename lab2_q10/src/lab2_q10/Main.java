package lab2_q10;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=in.nextInt();
		System.out.println("Enter elements of array");
		int[] a=new int[n];
		int inver=0;
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
			
		}
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
			if(a[i]>a[i+1]){
				inver++;
			}
			}
		}
		System.out.println("Inversions are: " +inver+"  Enter k");
		int k=in.nextInt();
		
		if(k<inver){
			int count=inver;
			for(int i=1;i<n-1;i++){
				for(int j=n-1;j>=i;j--){
					if(a[j]<a[j-1]){
						count--;
						int t=a[j];
						a[j]=a[j-1];
						a[j-1]=t;
					}
					if(count==k)
						break;
				}
			}
			
		}
		if(k>inver){
			int count=inver;
			for(int i=1;i<n-1;i++){
				for(int j=n-1;j>=i;j--){
					if(a[j]>a[j-1]){
						count++;
						int t=a[j];
						a[j]=a[j-1];
						a[j-1]=t;
					}
					if(count==k)
						break;
				}
			}
		}
		inver=0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
			if(a[i]>a[i+1]){
				inver++;
			}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		System.out.println("inversions:"+inver);
		
	}

}
