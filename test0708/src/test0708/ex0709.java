package test0708;

import java.util.Scanner;

public class ex0709 {

	public static void main(String[] args) {
		// 예금(add) 출금(out) 잔고(money) 종료(stop)/ 은행 프로그램 실습
		// 1누르면 예금으로 들어감(덧셈)
		//2 출금은 (뺄셈)/ 3잔고는 합계/ 4종료는 if통한 종료//무한반복 while
		//스위치 캐슬 써도됨
		
		int num = 0;//처음에 선택수 입력값
		int add = 0;//1.예금(덧셈-스캐너입력값
		int out = 0;//2.출금(뺄셈-스캐너입력값
		int money = 0;//3.잔고(합계-스캐너입력값
		int sum = 0;//잔액 합계
		boolean run = true;//무한반복 변수
		Scanner scan = new Scanner(System.in);//스캐너 시작
		
		//무한반복 while을 true인 run으로 무한반복 조건을 줌
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			num = scan.nextInt();//예금선택하는 번호

			//(오류)입력한수가 1~4번이 아닌경우
			if(num>5) {
				System.out.println("※※(오류) 1~4번까지 입력하세요.※※");
			}
			
			//↓ 1~4번까지 입력한 경우의수 시작- 그중 [예금]
			/*
			 * 필요한 입력 : 입금액
			 * 필요한 연산 : 기존 잔액에 입금액을 추가
			 * 필요한 출력 : 최종 잔액 출력
			 * 이과정이 알고리즘임, 사람들이 알아볼수 있게 풀어서 짜는것, 중요
			 */
			if(num==1) {
				System.out.print("예금액> ");
				add = scan.nextInt();//예금 입력 스캐너값
				sum=sum+add;//잔액=잔액+예금
				System.out.println("현재잔액은 "+sum+"원 입니다.");
			}//예금 괄호
			
			//↓출금 시작
			else if(num==2) {
				System.out.print("출금액> ");
				out = scan.nextInt();
				/*
				 * 필요한 입력 : 출금액
				 * 필요한 연산 : 기존 잔액에 출금액을 빼기
				 *   조건 : 잔액>출금액-> 출금연산수행
				 *   조건 : 잔액<출금액 -> 출금연산 수행안함
				 * 필요한 출력 : 최종 잔액 출력
				 * 이과정이 알고리즘임, 사람들이 알아볼수 있게 풀어서 짜는것, 중요
				 */
				
				//↓출금액<잔액 -> 정상출금
				if(out<sum) {
					sum = sum-out;
					System.out.println("현재잔액은 "+sum+"원 입니다.");
				}//정상출금 if 괄호

				//↓출금액>잔고-비정상 출금
				else if(out>sum) {
					System.out.println("잔고가 부족합니다.");
					System.out.println("현재잔액은 "+sum+"원 입니다.");
				}//출금액-비정상출금 괄호
			}//전체 출금액 괄호
			
			//↓잔고 
			else if(num==3) {
					System.out.print("잔고> ");
					System.out.println("현재잔액은 "+sum+"원 입니다.");
			}//잔고 괄호
			
			//종료 괄호
			else if(num==4) {
				run = false;//4입력하면 무한반복 종료
				System.out.println("프로그램이 종료되었습니다.");
			}//종료 괄호
			}//전체 while 괄호
			
	}//메인 메소드 괄호
}//처음 괄호
