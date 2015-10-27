package q4;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		Node root=null,curr=root;
		int height=Integer.parseInt(in.nextLine());
		Node[] parentsthis=new Node[100];
		Node[] parentsnext=new Node[100];
		for(int h=0;h<height;h++){
			parentsthis=parentsnext;
			int p=0,pt=0;
			String[] line=in.nextLine().split(" ");
			int sibling=0;
			for(int j=0;j<line.length;j++){
				int data=Integer.parseInt(line[j]);
				if(h==0){
					root=new Node(data);
					parentsnext[p]=root;p++;
				}
				
				else{
					if(data==0){
						sibling=0;
						pt++;
					}
					else{
						if(sibling==0){
							Node t=new Node(data);
							parentsnext[p]=t;p++;
							parentsthis[pt].left=t;sibling++;
						}
						else{
							Node t=new Node(data);parentsnext[p]=t;
							if(sibling==1)
								curr=parentsthis[pt].left;
							else
							curr.right=t;
							curr=curr.right;
						}
					}

				}
				
			}
		}
	}
}
