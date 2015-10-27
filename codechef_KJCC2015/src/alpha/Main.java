package alpha;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int tc=in.nextInt();
		in.nextLine();
		for(int z=0;z<tc;z++){
			String s=in.nextLine();
			String ans="";
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='z'){
					ans=ans+Character.toString('a');
				}
				else if(s.charAt(i)=='Z'){
					ans=ans+Character.toString('A');
				}
				else if(s.charAt(i)>='a' && s.charAt(i)<'z'){
					char x=(char)(s.charAt(i)+'b'-'a');
					ans=ans+Character.toString(x);
				}
				else if(s.charAt(i)>='A' && s.charAt(i)<'Z'){
					char x=(char)(s.charAt(i)+'b'-'a');
					ans=ans+Character.toString(x);
				}
			}
			System.out.println(ans);
		}
	}

}
