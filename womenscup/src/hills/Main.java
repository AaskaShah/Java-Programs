package hills;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int tc=in.nextInt();
		for(int z=0;z<tc;z++){
			int n=in.nextInt();
			int m=in.nextInt();
			int[] f=new int[n+1];
			int first=in.nextInt();
			f[first]++;
			f[in.nextInt()]++;
			for(int i=0;i<m-1;i++){
				
				int x=in.nextInt();
				if(f[x]==0){
					System.out.println("Danger!! Lucifer will trap you");
					break;
				}
				else{
					int y=in.nextInt();
					if(i==m-2){
						if(y==first){
							int flag=0;
							for(int j=1;j<n+1;j++){
								if(f[j]==0){
									System.out.println("Danger!! Lucifer will trap you");
									flag=1;
									break;
								}
								
							}
							if(flag==0)
							System.out.println("Go on get the Magical Lamp");
						}
						else
							System.out.println("Danger!! Lucifer will trap you");
					}
					
					f[y]++;
				}
				
			}
		}
	}
}
