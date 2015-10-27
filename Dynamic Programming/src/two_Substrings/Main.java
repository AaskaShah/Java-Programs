package two_Substrings;
import java.io.*;import java.util.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String s=in.readLine();
		int foundab=0;int foundba=0;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i-1)=='A' && s.charAt(i)=='B'){
				foundab=1;
				i++;
			}
			else if(s.charAt(i-1)=='B' && s.charAt(i)=='A'){ 
				foundba=1;
				i++;
			}
		}
		if(foundab==1 && foundba==1){
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}

}
