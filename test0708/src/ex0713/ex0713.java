package ex0713;

import java.util.Scanner;

public class ex0713 {

	public static void main(String[] args) {
		// 잔돈거슬러주기, 제일큰동전을 소지하면서 동전세기, 지폐없는상황
		//배열 활용, 거스름돈 구하기 문제
		//동전의 개수는 몫, 몫과 나머지, 돈을 입력받으면 500원 나누고 남은거로 100원 나누고 50원나누고 10원 나누고
		
		
		System.out.println("[ 잔돈 계산 프로그램 ]");
		int input = 0;//스캐너 입력값
		Scanner scan = new Scanner(System.in);
		System.out.print("금액 입력 : ");
		input = scan.nextInt();
		
		int [] change = {500, 100, 50, 10};//4가지를 반복할것
		int coinCount = 0;//동전개수 출력용 변수
		for(int j=0; j<change.length; j++) {
			coinCount = input/change[j];
			System.out.println(change[j]+"원 동전 : "+coinCount+"개");
			input = input % change[j];
		}
						
			}//괄호
	}//괄호


