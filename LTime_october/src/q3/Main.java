package q3;


import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int l=Integer.parseInt(in.readLine().trim());
        int p=Integer.parseInt(in.readLine().trim());
        int q=Integer.parseInt(in.readLine().trim());
        System.out.println((double)(p*l)/(p+q));
    }

}
