package lab2_heapsort;

public class HeapSort {

	public int[] a;
	public int n,heapsize;
	public HeapSort(int[] a){
		this.a=a;
		n=a.length;
		heapsize=n;
	}
	
	public void heapsort(){
		buildheap();
		for(int i=a.length-1;i>=2;i--){
			int t=a[1];
			a[1]=a[i];
			a[i]=t;
			heapsize--;
			maxheapify(1);
		}
		for(int i=1;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public void buildheap(){
		int end=a.length/2;
		if(a.length%2==0){
			end=end-1;
		}
		for(int i=end;i>0;i--){
			maxheapify(i);
		}
	}
	public void maxheapify(int index){
		int largest=index;
		int left=2*index;
		int right=2*index+1;
		
		if(left<heapsize && a[2*index]>a[largest]){
			largest=left;
		}
		if(right<heapsize && a[right]>a[largest]){
			largest=right;
		}
		if(largest!=index){
			int t=a[largest];
			a[largest]=a[index];
			a[index]=a[largest];
			maxheapify(largest);
		}
	}
}
