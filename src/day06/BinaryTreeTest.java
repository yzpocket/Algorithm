package day06;
import java.util.*;

public class BinaryTreeTest {

	static void menu() {
		System.out.println("------------------------------------");
		System.out.println("1. 삽입 2. 삭제 3. 검색 4. 출력 9. 종료");
		System.out.println("------------------------------------");
		System.out.println("메뉴 번호를 선택하세요=>");
		System.out.println("------------------------------------");
	}//-------------------------------

	public static void main(String[] args) {
		int num=0;
		Scanner sc=new Scanner(System.in);
		BinaryTree<Integer, User> tree=new BinaryTree<>();
		do {
			menu();
			num=sc.nextInt();
			switch(num) {
			case 1:
				User user=new User();
				user.input();//회원번호,이름, 연락처 입력받음
				tree.add(user.getNo(), user);
				break;
			case 2:
				System.out.println("삭제할 회원번호 입력: ");
				int no=sc.nextInt();
				boolean isDel=tree.remove(no);
				if(isDel) {
					System.out.println("회원정보를 삭제 완료했습니다");
				}else {
					System.out.println("해당 데이터는 없습니다.");
				}
				break;
			case 3:
				System.out.println("검색할 회원번호 입력: ");
				no=sc.nextInt();
				User findUser=tree.search(no);
				if(findUser==null) {
					System.out.println("없는 회원입니다");
				}else {
					System.out.println(findUser);
				}
				break;
			case 4:
				tree.print();				
				break;
			}
			
		}while(num!=9);
		System.out.println("Bye Bye~~");
	}

}
