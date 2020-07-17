package Mobile;

import java.util.Scanner;

public class Never_Main {

	public static void main(String[] args) {
		// 메인 클래스
		
		
		Scanner scan = new Scanner(System.in);
		String str = "";
		
		
		System.out.println("객체생성전");
		Naver Naver1 = new Naver();
		System.out.println("객체생성전");
		Naver Naver2 = new Naver("ddddd","dd1246333","aadf111","kim","19928","여자","dgkdk@mma","01055541");

		
		System.out.println("[Naver 회원가입]"+"\t");
		System.out.print("아이디 : ");
		str = scan.next();
//		System.out.println("@naver.com");
		System.out.print("비밀번호 : ");
		str = scan.next();
		System.out.print("비밀번호 재확인 : ");
		str = scan.next();
		System.out.print("이름 : ");
		str = scan.next();
		System.out.print("생년월일 : ");
		str = scan.next();
		System.out.print("성별: ");
		str = scan.next();
		System.out.print("본인확인이메일: ");
		str = scan.next();
		System.out.print("휴대폰: ");
		str = scan.next();
		
		System.out.println("가입하기");

	}

	@Override
	public String toString() {
		return "Never_Main []";
	}

}
