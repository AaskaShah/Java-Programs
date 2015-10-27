import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]){
		
		Scanner b=new Scanner(System.in);
		int n1=b.nextInt();
		int n2=b.nextInt();
		int n3=b.nextInt();int n4=0;
		//System.out.println(n1+" "+n2+" "+n3);
		int[] list1=new int[n1];
		int[] list2=new int[n2];
		int[] list3=new int[n3];
		List list4=new ArrayList<Integer>();
		for(int i=0;i<n1;i++){
			list1[i]=(b.nextInt());
		}
		for(int i=0;i<n2;i++){
			list2[i]=(b.nextInt());
		}
		for(int i=0;i<n3;i++){
			list3[i]=(b.nextInt());
		}
		int i1=0,i2=0,i3=0;
		while((i1!=n1 && i2!=n2) || (i1!=n1 && i3!=n3) || (i3!=n3 && i2!=n2)){
			if(i1!=n1 && i2!=n2 && i3!=n3 && (list1[i1]==list2[i2]) && (list1[i1]==list3[i3])){
				list4.add(list1[i1]);
				n4++;i1++;i2++;i3++;
			}
			else if(i1!=n1 && i2!=n2 && (list1[i1]==list2[i2])){
				list4.add(list1[i1]);
				n4++;i1++;i2++;
			}
			else if(i1!=n1 && i3!=n3 && (list1[i1]==list3[i3])){
				list4.add(list1[i1]);
				n4++;i1++;i3++;
			}
			else if(i3!=n3 && i2!=n2 && (list3[i3]==list2[i2])){
				list4.add(list3[i3]);
				n4++;i3++;i2++;
			}
			else{
				if(i1!=n1 && i2!=n2 && list1[i1]<list2[i2]){
					if(i3!=n3 && list3[i3]<list1[i1])
					i3++;
					else
					i1++;
				}
				else{
					if(i3!=n3 && i2!=n2 &&list3[i3]<list2[i2])
					i3++;
					else if(i3!=n3 && i2!=n2 &&list3[i3]>list2[i2])
					i2++;
				}
			}
		}
		
		System.out.println(n4);
		for(int i=0;i<list4.size();i++){
			System.out.println(list4.get(i));
		}
	}

}
