import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int tc=in.nextInt();
		
		for(int z=0;z<tc;z++){
			int n=in.nextInt();
			int m=in.nextInt();
			in.nextLine();
			String[] rows=new String[n];
			for(int i=0;i<n;i++){
				rows[i]=in.nextLine().toLowerCase();
				
			}
			String[] cols=new String[m];
			for(int i=0;i<m;i++){
				cols[i]="";
			}
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					cols[i]=cols[i]+Character.toString(rows[j].charAt(i));
				}
				//System.out.println(cols[i]);
			}
			int flag=0;
			for(int i=0;i<n;i++){
				if(rows[i].contains("spoon")){
					
					flag=1;
					break;
				}
			}
			for(int i=0;i<m;i++){
				if(cols[i].contains("spoon")){
					
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println("There is indeed no spoon!");
			}
			else{
				System.out.println("There is a spoon!");
			}
		}
	}

}
