package day02;
import java.util.*;
public class Q10_LongWord {
	//String 클래스의 split(구분자) 활용해보기
	public String search(String str) {
		String res="";
		String[] tokens=str.split(" ");
		for(String tk:tokens) {
			//System.out.println(tk);
			if(tk.length()>res.length()) {
				res=tk;
			}
		}		
		return res;
	}//----------------------
	//int indexOf(String str) : 특정한 문자
	//String substring(int start, int end): start부터 end-1까지 오려내서 반환
	//String substring(int start): 시작 인덱스부터 끝까지 오려내서 반환
	public String search2(String str) {
		String res="";
		int pos=0;
		int max=-999;
		//Banana is Good
		while((pos=str.indexOf(" "))!=-1) {
			String word=str.substring(0,pos);
			if(word.length()>max) {
				max=word.length();
				res=word;
			}
			str=str.substring(pos+1);
			System.out.println(word+": "+max);
		}
		System.out.println(str);
		if(str.length()>max) {
			max=str.length();
			res=str;
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열을 입력하세요: ");
		String str=sc.nextLine();
		Q10_LongWord app=new Q10_LongWord();
		System.out.println("가장 긴 단어: "+app.search2(str));
	}

}
