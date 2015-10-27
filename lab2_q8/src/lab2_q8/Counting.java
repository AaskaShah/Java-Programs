package lab2_q8;

public class Counting {
	
	int[] a;
	int k;
	public Counting(int[] arr){
		a=arr;
		k=9;
	}
	
	public void countingsort(){
		int[] b=new int[a.length+1];
		int[] c=new int[k+1];
		for(int i=0;i<k+1;i++){
			c[i]=0;
		}
		for(int i=0;i<a.length;i++){
			c[a[i]]++;
		}
		
		for(int i=1;i<k+1;i++){
			c[i]=c[i]+c[i-1];
		}
		
		for(int i=a.length-1;i>=0;i--){
			//System.out.println("in for");
			b[c[a[i]]]=a[i];
			c[a[i]]--;
		}
		for(int i=1;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
	}

}
