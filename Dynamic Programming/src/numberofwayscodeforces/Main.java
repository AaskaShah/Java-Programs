package numberofwayscodeforces;
import java.io.BufferedReader;
import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine().trim());
		String[] x=in.readLine().trim().split(" ");
		int[] a=new int[n];
		long[] c=new long[n];
		long total=0;
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(x[i]);
			total=total+a[i];
		}
		if(total%3!=0){
			System.out.println(0);
		}
		else{
		long count=0;
		long temps=0;
		total=total/3;
		for(int i=0;i<n-2;i++){
			temps=temps+a[i];
			if(temps==total){
				c[i]=1;
			}
		}
		for(int i=1;i<n;i++){
			c[i]=c[i]+c[i-1];
			//System.out.print(c[i]+" ");
		}
		temps=0;
		for(int i=n-1;i>1;i--){
			temps=temps+a[i];
			if(temps==total){
				count=count+c[i-2];
			}
		}
		System.out.println(count);
		}
	}
	

}
