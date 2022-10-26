package day02;
import java.util.*;
public class Q6_ArrayCopy {
	//크기가 작은 쪽 배열을 큰쪽으로 카피하세요
	public static void copy(int[] a, int[] b) {
		int num=(a.length<b.length)?a.length:b.length;
		for(int i=0;i<num;i++) {
			if(a.length<b.length) {
				b[i]=a[i];
				System.out.println("a를 b로 카피 완료");
			}else {
				a[i]=b[i];
				System.out.println("b를 a로 카피 완료");
			}
		}
	}
	
	//크기가 작은 쪽 배열을 큰쪽으로 카피하세요
	public static void reverse_copy(int[] a, int[] b) {
		int num=(a.length<b.length)?a.length:b.length;
		for(int i=0;i<num;i++) {
			if(a.length<b.length) {
				b[i]=a[num-1-i];
				System.out.println("a를 b로 카피 완료");
			}else {
				a[i]=b[num-1-i];
				System.out.println("b를 a로 카피 완료");
			}
		}
	}
	
	public static int[] getArray(int n) {
		Scanner sc=new Scanner(System.in);
		System.out.println("요소수 입력: ");
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			System.out.print("arr"+n+"["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		return arr;
	}//--------------------------

	public static void main(String[] args) {
		int a[]=getArray(1);
		int b[]=getArray(2);
//		copy(a,b);
		reverse_copy(a,b);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
