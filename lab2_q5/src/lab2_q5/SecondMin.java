package lab2_q5;

public class SecondMin {
	public int[] a;
	public int n;
	public SecondMin(int[] a){
		this.a=a;
		n=a.length;
	}
	
	public void secondmin(){
		
		int treedepth=(int)Math.ceil(Math.log(n)/Math.log(2))+1;
		//System.out.println(treedepth);
		int[][] tree=new int[treedepth][n];
		
		for(int i=0;i<treedepth;i++){
			for(int j=0;j<n;j++){
				tree[i][j]=-1;
			}
		}
		
		tree[0]=a;
		int size=a.length;
		for(int i=1;i<treedepth;i++){
			int co=0,j;
			int flag=0;
			
			
			for(j=0;j<size;j+=2){
				//System.out.println("in for");
				if(j==size-1){            //size%2!=0
					
					tree[i][co]=tree[i-1][size-1];
					co++;
					flag=1;
					continue;
				}
				if(tree[i-1][j]<tree[i-1][j+1]){
					tree[i][co]=tree[i-1][j];
					co++;
					continue;
				}
				else{
					tree[i][co]=tree[i-1][j+1];
					co++;
					continue;
				}
				
			}
			
			
			size=(int)Math.ceil(size/2);
			if(flag==1)
				size++;
		}
		
		int rootindex=0;
		int min=tree[treedepth-1][0];
		int min2=1000000;
		//System.out.println(min);
		for(int i=treedepth-2;i>=0;i--){
			//System.out.println("in for");
			int adleft=0,adright=0;
			adleft=tree[i][rootindex*2];
			if(len(tree[i])>=2*rootindex+2){
				adright=tree[i][rootindex*2+1];
			}
			else
				adright=-1;
			
			//---
			//System.out.println("left:"+adleft+" right:"+adright);
			if(adright==-1){
				rootindex=2*rootindex;
				continue;
			}
			else if(adleft>adright){
				rootindex=2*rootindex+1;
				if(min2>adleft){
					min2=adleft;
				}
			}
			else if(adleft<adright){
				rootindex=2*rootindex;
				if(min2>adright){
					min2=adright;
				}
			}
			
		}
		System.out.println(min2);
	}
	
	public int len(int[] a){
		int i=0;
		while(i<n && a[i]!=-1){
			i++;
		}
		return i;
	}

}
