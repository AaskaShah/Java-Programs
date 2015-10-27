package Palindromes;
import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int tc=in.nextInt();
		for(int z=0;z<tc;z++){
			int l=in.nextInt();int r=in.nextInt();
			int sum=0;
			
			for(int n=l;n<=r;n++){
				int pali=1;
				String no=Integer.toString(n);
				for(int i=0;i<no.length()/2;i++){
					if(no.charAt(i)!=no.charAt(no.length()-1-i))
						pali=0;
				}
				if(pali==1)
					sum=sum+n;
			}
			System.out.println(sum);
		}
	}

}
