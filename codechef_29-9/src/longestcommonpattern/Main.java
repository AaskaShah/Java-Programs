package longestcommonpattern;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int tc=in.nextInt();
		for(int z=0;z<tc;z++){
			long n=in.nextLong();
			int[] freq=new int[1000002];
			
			for(int i=0;i<n;i++){
				freq[in.nextInt()]++;
				
			}
			long pairs=(n*(n-1)/2);
			for(int i=0;i<1000002;i++){
				pairs=pairs-freq[i]*(freq[i]-1)/2;
			}
			System.out.println(pairs);
		}

	}

}
