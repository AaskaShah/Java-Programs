package linear;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int tc=in.nextInt();
		
		for(int z=0;z<tc;z++){
			
			int n=in.nextInt();
			int[] x=new int[n];
			int[] y=new int[n];
			
			for(int i=0;i<n;i++){
				x[i]=in.nextInt();y[i]=in.nextInt();
			}
			int max=0;
			for(int i=0;i<n-1;i++){
				HashMap<Double, Integer> map=new HashMap<Double,Integer>();
				
				for(int j=i+1;j<n;j++){
					double yd=y[j]-y[i];
					double xd=x[j]-x[i];
					if(xd==0){
						if(map.containsKey(1000000.0)){
							map.put(1000000.0, map.get(1000000.0)+1);
						}
						else
						map.put(1000000.0, 1);
					}else{
						if(map.containsKey(yd/xd)){
							map.put(yd/xd, map.get(yd/xd)+1);
						}
						else
						map.put(yd/xd, 1);
					}
				}
				int inline=Collections.max(map.values());
				//System.out.print(inline+" ");
				if(max<inline)
					max=inline;
				}
			System.out.println(max+1);
		}
	}


}
