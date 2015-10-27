import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in= new Scanner(System.in);
		int tc=Integer.parseInt(in.nextLine());
		
		for(int k=0;k<tc;k++){
			int count=0;
			Hashtable<String, Character> hash=new Hashtable<String,Character>();
			int n=Integer.parseInt(in.nextLine());
			for(int j=0;j<n;j++){
				String[] x=in.nextLine().split(" ");
				char vote=x[1].charAt(0);
				String name=x[0];
				if(hash.containsKey(name)){
					if(hash.get(name)=='+'){
						count--;
						hash.put(name, vote);
					}
					else{
						count++;
						hash.put(name, vote);
					}
				}
				else{
					hash.put(name, vote);
					
				}
				if(vote=='+')
					count++;
				else
					count--;
			}
			
			System.out.println(count);
		}
	}
	

}
