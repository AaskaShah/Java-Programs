package time;
import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine().trim());
		for(int z=0;z<tc;z++){
			float a=Float.parseFloat(in.readLine().trim());
			/*float time=(1.0f/30.0f)*(a%360);
			if(time<0)
				time=time+12.0f;
			int hours=(int)time;
			int minutes=(int)(time*60)%60;
			
			//-a time
			float b=-1*a;
			float timeb=(1.0f/30.0f)*(b%360);
			if(timeb<0)
				timeb=-1*timeb;
			int hoursb=(int)timeb;
			int minutesb=(int)(timeb*60)%60;
			*/
			for(int t=0;t<720;t++){
				if(Math.abs(t*6-t/12)%360==a%360){
					System.out.println(t);
					printtime(t);
				}
				
			}
			/*
			if(hours>hoursb || (hours==hoursb && minutes>minutesb)){
				print(hours,minutes);
				print(hoursb,minutesb);
			}
			else if(hoursb>hours && (hours==hoursb && minutes<minutesb)){
				print(hoursb,minutesb);
				print(hours,minutes);
			}
			else
				print(hours,minutes);*/
			
		}
		
		
	}

	static void printtime(int t){
		int hours=t/60;
		int min=t%60;
		if(min%10<5)
			min=min-min%10;
		else{
			min=min-min%10+10;
		}
		if(min>59){
			hours++;
			min=min-60;
		}
		if(hours==12)hours=0;
		if(hours<10)
			System.out.print(0);
		System.out.print(hours+":");
		if(min<10)
			System.out.print(0);
		System.out.println(min);
		
	}
	static void print(int hours,int minutes){
		
		if(hours<10)
			System.out.print(0);
		System.out.print(hours+":");
		if(minutes<10)
			System.out.print(0);
		System.out.println(minutes);
	}
}
