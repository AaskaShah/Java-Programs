
public class MinMax {

	public int[] a;
	public int n;
	public MinMax(int[] a){
		this.a=a;
		n=a.length;
	}
	
	
	public void minmax(){
		int min=a[0];
		int max=a[0];
		for(int j=0;j<n;j+=2){
			if(j==n-1){
				if(a[j]>max){
					max=a[j];
				}
				if(a[j]<min){
					min=a[j];
				}
				continue;
			}
			if(a[j]>a[j+1]){
				if(a[j]>max){
					max=a[j];
				}
				if(a[j+1]<min){
					min=a[j+1];
				}
				continue;
			}
			else{
				if(a[j+1]>max){
					max=a[j+1];
				}
				if(a[j]<min){
					min=a[j];
				}
				continue;
			}
			
		}
		System.out.println("min="+min+" max="+max);
	}
	
}
