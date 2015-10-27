package codechef_feedback;

import java.util.Scanner;

public class main {
public static void main(String args[]){
		
		Scanner b=new Scanner(System.in);
		int tc=Integer.parseInt(b.nextLine());
		for(int i=0;i<tc;i++){
			String bin=b.nextLine();int t1,t2,t3,found=0;
			for(int j=3;j<bin.length()-2;j++){
				t1=bin.charAt(j);
				t2=bin.charAt(j+1);
				t3=bin.charAt(j+2);
				if((t1=='1' && t2=='0' && t3=='1') || (t1=='0' && t2=='1' && t3=='0')){
					found=1;break;
				}
			}
			if(found==1){
				System.out.println("Good");
			}
			else
				System.out.println("Bad");
		}
}

}
