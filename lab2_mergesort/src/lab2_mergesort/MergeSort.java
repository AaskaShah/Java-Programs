package lab2_mergesort;

public class MergeSort {
	
	public int[] a;
	public int n;
	public MergeSort(int[] a){
		this.a=a;
		n=a.length;
	}
	
	public void mergesort(int l,int r){
		if(l<r){
			int mid=(l+r)/2;
			//System.out.println(mid);
			mergesort(l,mid);
			mergesort(mid+1,r);
			merge(l,mid,r);
		}
		for(int g=l;g<r+1;g++)
			System.out.print(a[g]+" ");
		System.out.println();
	}
	
	public void merge(int l,int mid,int r){
		int[] arr1=new int[mid-l+1];
		int[] arr2=new int[r-mid];
		int i=0,j=0,p=l;
		while(i<arr1.length){
			arr1[i]=a[l+i];
			i++;
		}
	
		while(j<arr2.length){
			arr2[j]=a[1+mid+j];
			j++;
		}
		i=0;j=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]){
				a[p]=arr1[i++];
			}
			else
				a[p]=arr2[j++];
			p++;
		}
		while(i!=arr1.length){
			a[p++]=arr1[i++];
		}
		while(j!=arr2.length){
			a[p++]=arr2[j++];
		}
		
	}
}
