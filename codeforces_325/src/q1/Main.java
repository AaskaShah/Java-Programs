package q1;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine().trim());
		
		int[] v=new int[n];
		int[] p=new int[n];
		int[] d=new int[n];
		int[] childs=new int[n];
		
		for(int i=0;i<n;i++){
			String[] x=in.readLine().trim().split(" ");
			v[i]=Integer.parseInt(x[0]);
			d[i]=Integer.parseInt(x[1]);
			p[i]=Integer.parseInt(x[2]);
			//System.out.println(a[i]);
		}
		int count=0;
		for(int i=0;i<n;i++){
			if(p[i]>0){
				childs[count]=i+1;
				count++;
			for(int j=i+1;j<n;j++){
				p[j]=p[j]-(v[i]+i-j);
			}
			}
			int co=0;
			if(isneg(p,i+co+1)!=-1){
				int sub=d[isneg(p,i+co+1)];
				//System.out.println(sub);
				for(int j=i+1;j<n;j++){
					p[j]=p[j]-sub;
				}
				co++;
			}
			
		}
		System.out.println(count);
		for(int i=0;i<count;i++){
			System.out.print(childs[i]+" ");
		}
		System.out.println(); 
		
	}

	static int isneg(int[] p,int i){
		
		
		while(i<p.length && p[i]>=0)
			i++;
		if(i!=p.length)
			return i;
		else
			return -1;
	}
}
