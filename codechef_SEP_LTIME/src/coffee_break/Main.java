package coffee_break;
import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int tc=in.nextInt();
		for(int z=0;z<tc;z++){
			int n=in.nextInt();int k=in.nextInt();int d=in.nextInt();int m=in.nextInt();
			ArrayList<Integer> a=new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				a.add(in.nextInt());
			}
			Collections.sort(a);
			int sum=0;
			int countd=0;
			for(int i=a.size()-1;i>=0;i--){
				if(k-1==i){
					k--;
				}
				
				else{
					countd++;
					if(countd<=d){
						sum=sum+a.get(i)*m;
						System.out.println(a.get(i));
						
					}
					else{
						countd=0;
						k--;
					}
					
				}
			}
			System.out.println(sum);
		}
	}

}
