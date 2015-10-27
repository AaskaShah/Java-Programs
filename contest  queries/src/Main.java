import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[])throws IOException{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String[] x=b.readLine().split(" ");
		int n=Integer.parseInt(x[0]);
		int queries=Integer.parseInt(x[1]);int[] keys=new int[n];
		Hashtable<Integer, Integer> hash=new Hashtable<Integer, Integer>();
		x=b.readLine().split(" ");
		for(int i=0;i<n;i++){
			int val=Integer.parseInt(x[i]);
			keys[i]=val;//System.out.println("added "+val);
			if(hash.containsKey(val))
				hash.put(val, hash.get(val)+1);
			else
				hash.put(val, 1);
		}
		
		for(int i=0;i<queries;i++){
			x=b.readLine().split(" ");
			int l=Integer.parseInt(x[0]);
			int r=Integer.parseInt(x[1]);int c;
			if((float)(r-l+1)/3.0==(r-l+1)/3){
				c=(r-l+1)/3;
			}
			else{
				c=(r-l+1)/3+1;
			}
			System.out.println(c);
			int count=0;
			for(int k=l-1;k<r;k++){
				if(hash.get(keys[k])>=c)
					count++;
			}
			System.out.print(count+" ");
		}
		
	}
	

}
