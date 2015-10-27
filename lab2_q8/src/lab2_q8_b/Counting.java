package lab2_q8_b;

public class Counting {

	int[] a;
	int k;
	public Counting(int[] arr){
		a=arr;
		k=9;
	}
	
	public void countingsort_b(){
		int[] b=new int[a.length+1];
		int[] c=new int[k+1];
		
		int[] temp=new int[k+1];
		temp=c;
		for(int i=0;i<k+1;i++){          //initializing c
			c[i]=0;
		}
		for(int i=0;i<a.length;i++){	//frequencies of all elements
			c[a[i]]++;
		}
		int fmax=c[0];
		for(int i=0;i<k+1;i++){        // finding max frequencies
			if(c[i]>fmax)
				fmax=c[i];
		}
		//System.out.println(fmax);
		int[][] d=new int[fmax][k+1];	//frquencies according to fmins
		int[] fmins=new int[fmax];
		int add=0;
		for(int co=0;allnotzero(temp);co++){  //building d[][]
			//System.out.println("in for making d");
			int fmin=10000;
			for(int i=0;i<k+1;i++){
				if(temp[i]!=0 && temp[i]<fmin)
					fmin=temp[i];
			}
			fmins[co]=fmin;
			//System.out.print(" -"+fmin+"- ");
			for(int i=0;i<k+1;i++){
				if(temp[i]!=0)
					d[co][i]=fmin;
				else
					d[co][i]=0;
			}
			for(int i=1;i<k+1;i++){
				d[co][i]=d[co][i]+d[co][i-1];
			}
			
			for(int i=0;i<k+1;i++){
				d[co][i]=d[co][i]+add;
			}
			for(int i=0;i<k+1;i++){
				if(temp[i]!=0)
				temp[i]=temp[i]-fmins[co];
				//System.out.print(temp[i]+" ");
			}
			//System.out.println(allnotzero(temp));
			add=d[co][k];
		}
		for(int i=0;i<k+1;i++){          
			temp[i]=0;    //temp will show occurance
		}
		
		for(int i=0;i<a.length;i++){
			int co=0;
			temp[a[i]]++;
			
			if(temp[a[i]]>fmins[co]){
				
				co+=(temp[a[i]]-fmins[co]);
			}
			b[d[co][a[i]]]=a[i];
		}
		
		for(int i=1;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
	}
	
	public boolean allnotzero(int[] a){
		
		for(int i=0;i<a.length && a[i]==0;i++){
			if(i==a.length-1){
				return false;
			}
		}
			return true;
	}
}
