package lab2_q1;

public class Search {
	
	int[] num;
	
	public Search(int[] arr){
		num=arr;
	}
	
	
	public void cbsearch(int key,int min,int max){
		int mid=(min+max)/2;
		if(min>max){
			System.out.println("Element not present");
			return;
		}
		if(num[mid]==key){
			System.out.println(key+" is at index "+mid);
			return;
		}
		if(num[mid]<num[max]){
			if(num[mid]<=key && key<=num[max]){
				cbsearch(key,mid+1,max);
			}
			else{
				cbsearch(key,min,mid);
			}
		}
		else{
			if(num[mid]>=key && key>=num[min]){
				cbsearch(key,min,mid);
			}
			else{
				cbsearch(key,mid+1,max);
			}
		}
	}

}
