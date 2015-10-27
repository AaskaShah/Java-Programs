package q2;
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args)throws IOException {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int[] ab=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			b[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			ab[i]=a[i]*b[i];
		}
		
		PriorityQueue p=new PriorityQueue(ab, n);
		p.buildheap();
		for(int i=0;i<1;i++){
			int max=p.maximum();
			System.out.println(max);
			
		}
		
		
		
		
	}

	public static class PriorityQueue {
		
		int[] a=new int[100];
		int length=0;
		int heapsize=0;
		public PriorityQueue(int[] a,int n){
			for(int i=1;i<n;i++)
				this.a[i]=a[i];
			length=n-1;
			heapsize=length-1;
			
		}
		
		public void buildheap(){
			for(int i=(length)/2;i>0;i--){
				maxheapify(i);
			}
		}
		
		public void maxheapify(int i){
			int l=2*i;
			int r=2*i+1;
			int largest=i;
			if(l<=heapsize && a[l]>a[i])
				largest=l;
			if(r<=heapsize && a[r]>a[largest])
				largest=r;
			if(largest!=i){
				int t=a[i];
				a[i]=a[largest];
				a[largest]=t;
				maxheapify(largest);
			}
		}
		
		public int maximum(){
			buildheap();
			return a[1];
		}
		
		public int heapextractmax(){
			
			if(heapsize<1){
				System.out.println("heap underflow");
				return -1;
			}
			buildheap();
			int max=a[1];
			a[1]=a[heapsize];
			heapsize--;length--;
			maxheapify(1);
			return max;
		}

		public void heapincreasekey(int i,int key){
			if(key>a[i]){
				System.out.println("Enter a smaller value");
				return;
			}
			a[i]=key;
			/*while(i<=heapsize){
				if(a[i/2]<a[i]){
					int t=a[i];
					a[i]=a[i/2];
					a[i/2]=t;
					
				}
				i=i/2;
			}
			*/
			maxheapify(i);
			for(int j=1;j<=length;j++){
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
		
		public void heapinsert(int key){
			a[heapsize+1]=key;
			heapsize++;
			length++;
			heapincreasekey(heapsize, key);
			
			for(int j=1;j<=length;j++){
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
	}
	}
