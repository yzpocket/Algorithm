package day02;
//소수 구하기
//소수: 1과 자신으로만 나누어지는 수
//1 ~ 1000까지의 정수 중 소수를 구해 출력하세요
public class Q12_PrimeNum {
	
	public static void getPrime() {
		int cnt=0;
		for(int num=2;num<=1000;num++) {
			int i;
			for(i=2;i<=num;i++) {
				cnt++;
				if(num%i==0) {
					break;
				}
			}//for---
			if(i==num) {
				System.out.println(num);
			}
			
		}//for--------
		System.out.println("수행횟수: "+cnt);
	}//-------------------------
	public static void getPrime2() {
		int count=0;
		for(int i=2; i<=1000; i++) {
			for(int j=2; j<=i; j++) {
				if(i%j==0) count++;
			}
			if(count==1) System.out.print(i+" ");
			count=0;
		}//for---------
	}


	public static void main(String[] args) {
		getPrime();
	}

}
