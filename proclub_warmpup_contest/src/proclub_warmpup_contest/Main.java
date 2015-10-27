package proclub_warmpup_contest;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int tc=in.nextInt();
		in.nextLine();
		for(int i=0;i<tc;i++){
			String x[] =in.nextLine().trim().split(" ");
			int k=Integer.parseInt(x[0]);
			String s=x[1];
			String ans="";
			for(int j=0;j<s.length();j++){
				int t=s.charAt(j)+(k%26);
				if(t>'z')
					t=t-26;
				System.out.print(Character.toString((char)t));
			}
			System.out.println();
		}
	}

}
