package lab2_q1;
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
		Search b=new Search(a);
		System.out.println("1 x-search ");
		while(in.hasNext()){
			int query=in.nextInt();
		
			if(query==1){
				b.cbsearch(in.nextInt(),0,a.length-1);
			}
		
		}
	}

}
