package game;
import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine().trim());
		for(int z=0;z<tc;z++){
			int n=Integer.parseInt(in.readLine().trim());
			String correct=in.readLine();
			String chef=in.readLine();
			int[] w=new int[n+1];
			String[] x=in.readLine().trim().split(" ");
			
			for(int i=0;i<=n;i++){
				w[i]=Integer.parseInt(x[i]);
			}
			int count=0;
			int maxwin=w[0];
			for(int i=0;i<n;i++){
				if(correct.charAt(i)==chef.charAt(i)){
					count++;
					if(w[count]>maxwin)
						maxwin=w[count];
				}
			}
			if(count==n)
				maxwin=w[count];
			System.out.println(maxwin);
		}
			
	}
	

}
