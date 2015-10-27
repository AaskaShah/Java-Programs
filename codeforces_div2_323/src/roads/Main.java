package roads;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine().trim());
		int[] hor=new int[n];
		int[] ver=new int[n];
		ArrayList<Integer> days=new ArrayList<Integer>();
		for(int d=0;d<n*n;d++){
			String[] x=in.readLine().trim().split(" ");
			int h=Integer.parseInt(x[0]);
			int v=Integer.parseInt(x[1]);
			if(hor[h-1]==0 && ver[v-1]==0){
				hor[h-1]=1;ver[v-1]=1;
				days.add(d+1);
			}
		}
		for(int i=0;i<days.size();i++){
			System.out.print(days.get(i)+" ");
		}
		System.out.println();
	}

}
