package day01;
/*
 * 중첩 반복문 이용해서 곱셈 테이블을 출력하세요.
 */
public class Q3_GopTable {

	public static void printTable() {
		System.out.print("   |");
		for(int i=1; i<10; i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		System.out.println("---+---------------------------------");
		for(int i=1;i<10;i++) {
			System.out.printf("%2d |",i);
			for(int j=1;j<10;j++) {
				System.out.printf("%3d",(i*j));
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		printTable();
	}

}
