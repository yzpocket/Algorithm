package day01;

import java.util.Scanner;
//3개의 중앙값을 구할 때 13가지 경우가 나옴. 이조합을 나열하면 결정 트리라고 한다.
public class Q2_Medium {
	
	public static int median(int a, int b, int c) {
		int res=0;
		if((a>b&&a<c)||(a<b&&a>c)) {
			res=a;
		}else if((b>a&&b<c)||(b<a&&b>c)) {
			res=b;
		}else {
			res=c;
		}
		return res;
	}
	public static int median2(int a,int b,int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			}
			else if(a>c) {
				return c;
			}else {
				return a;
			}
		}else if(a>c) {
			return a;
		}else if(b>c) {
			return c;
		}else {
			return b;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
//		int res=median(a,b,c);
		int res=median2(a,b,c);
		System.out.printf("%d,%d,%d 중에 중앙 값 : %d%n",a,b,c,res);
	}

}
