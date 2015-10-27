package q1;

import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] x=in.readLine().trim().split(" ");
		int n=Integer.parseInt(x[0]);
		int m=Integer.parseInt(x[1]);
		String s=in.readLine();
		char[] str=s.toCharArray();
		for(int i=0;i<m;i++){
			x=in.readLine().trim().split(" ");
			char a=x[0].charAt(0);
			char b=x[1].charAt(0);
			int change=0;
			
			for(int j=0;j<n;j++){
				change=0;
				if(s.charAt(j)==a){
					s=s.substring(0,j)+Character.toString(b)+s.substring(j+1);
					change=1;
				}
				if(s.charAt(j)==b && change==0){
					s=s.substring(0,j)+Character.toString(a)+s.substring(j+1);
				}
			}
			
			//System.out.println(s);
		}
		System.out.println(s);
	}

}
