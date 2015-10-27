package lab2_q11;

public class Sort {
	public int exchange=0,comp=0;
	public int[] num;
	public Sort(int[] arr){
		num=arr;
	}
	
	public void quicksort(int p,int r){
		comp++;
		if(p<r){
			int q=partition(p,r);
			quicksort(p,q-1);
			quicksort(q+1,r);
		}
	}
	
	public int partition(int p,int r){
		int pivot=num[r];
		int i=p-1;
		for(int j=p;j<r;j++){
			comp++;
			if(num[j]<=pivot){
				i++;
				swap(j,i);
			}
		}
		swap(i+1,r);
		return i+1;
	}
	
	public void swap(int x,int y){
		
		exchange++;
		int t=num[x];
		num[x]=num[y];
		num[y]=t;
	}

}
