import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	public static void main(String args[])throws IOException{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(b.readLine());
		int count=0;
		List walk=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			String[] x=b.readLine().split(" ");
			int query=Integer.parseInt(x[0]);
			if(query==1){
				int steps=Integer.parseInt(x[1]);
				int index=Collections.binarySearch(walk, steps);
				if(index<0){
					index=index*(-1);
				}
				if(walk.contains(steps)){
					index++;
				}
				walk.add(index-1, steps);
				count++;
			}
			if(query==2){
				if(count<3){
					System.out.println("Not enough walks");
				}
				else
				System.out.println(walk.get(count-count/3));
			}
		}
		
	}
}
