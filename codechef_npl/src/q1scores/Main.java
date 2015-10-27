package q1scores;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		long max=0,secondmax=0;
		for(long i=0;i<n;i++){
			long x=(in.nextLong());
			if( x > secondmax )
    		{
        if( x > max )
        {
            secondmax = max;
            max = x;
        }
        else
        {
            secondmax = x;
        }
    }

		}
		System.out.print(max);
		
		System.out.println(" "+secondmax);
	}

}
