package lab2_q11;
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
		Sort s=new Sort(a);
		System.out.println("1-quicksort");
		while(in.hasNext()){
			int query=in.nextInt();
		
			if(query==1){
				s.quicksort(0,a.length-1);
				for(int i=0;i<n;i++){
					System.out.print(a[i]+" ");
				}
				
				System.out.println();
				System.out.println("comparisons="+s.comp+" exchanges="+s.exchange);
				
			}
			
		}
		
	}
}
