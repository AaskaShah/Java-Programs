package A;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        BigInteger b=BigInteger.valueOf(3).pow(3*n);
        //BigInteger b2=BigInteger.valueOf((n*(3*n-1)));
        //BigInteger b3=BigInteger.valueOf((3*n-2)*7);
        //b2=b2.multiply(b3);
        //b2=b2.divide(BigInteger.valueOf(2));
        BigInteger b2=BigInteger.valueOf(7).pow(n);
        b=b.subtract(b2);
        System.out.println(b.mod(BigInteger.valueOf(1000000007)));
        
        	
        
	}

}
