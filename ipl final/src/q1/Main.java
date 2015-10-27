package q1;
import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine().trim());
		int[] a={
				
		};
		for(int z=0;z<tc;z++){
			long n=Long.parseLong(in.readLine().trim());
			long chances=0;
			long sum=0;
			long counter=0;
			for(long i=2;;i++){
				if(i>=1000){
					counter++;
					System.out.println(i*(i+1)*(i-1)*(3*i+2)/12);
				}
				/*if(i*(i+1)*(i-1)*(3*i+2)/12<=n)
				{
					chances++;
				}*/
				if(sum+i*(i-1)*i<=n){
					sum=sum+i*i*(i-1);
					chances++;
					
				}
				
				
				else{
					System.out.println(chances);
					if(chances==0){
						System.out.println("Draw");
						
					}
					else if(chances%2==0){
						System.out.println("Ketan");
					}
					else
						System.out.println("Dhruv");
					break;
				}
			}
			System.out.println(counter);
		}
	}

}
