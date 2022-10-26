package day01;
import java.util.*;

public class Q1_Max {
	public static int max2(int a, int b) {
		int max=0;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		return max;
	}
	public static int max3(int a, int b, int c) {
		int max=a;
		if(b>max) {
			max=b;
		}if(c>max) {
			max=c;
		}return max;
	}
	public static int max4(int a, int b, int c, int d) {
		int max=max2(max2(max2(a,b),c),d);
//		int x=max2(a,b);
//		int y=max2(c,d);
//		int max=max2(x,y);
		
	
//		int max=0;
//		int tmp=0,tmp1=0;
//		tmp=(a>b)?a:b;
//		tmp1=(tmp>c)?tmp:c;
//		max=(tmp1>d)?tmp1:d;
		
		return max;
	
	}
	
	
	public static void main(String[] args) {
		int a=50;
		int b=22;
		int c=85;
		int d=69;
		
		int mx=max2(a,b);
		int mx2=max3(a,b,c);
		int mx3=max4(a,b,c,d);
		System.out.printf("%d와 %d중 최대값 : %d%n",a,b,mx);
		System.out.printf("%d,%d,%d중 최대값 : %d%n",a,b,c,mx2);
		System.out.printf("%d,%d,%d,%d중 최대값 : %d%n",a,b,c,d,mx3);
		
	}

}
