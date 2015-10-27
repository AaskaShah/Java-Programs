package lab2_q7;

public class Matrix_search {
	
	public int[][] mat;
	int n=0;
	public Matrix_search(int[][] a){
		mat=a;
		n=mat[0].length;
	}
	
	public void search(int key){
		int row=0;
		int col=n-1;
		while(row!=n && col!=-1){
			if(mat[row][col]==key){
				System.out.println(key + " is at position ("+(row+1)+","+(col+1)+")");
				return;
			}
			else if(mat[row][col]>key){
				col--;
			}
			else{
				row++;
			}
		}
		System.out.println("Element not present");
	}

}
