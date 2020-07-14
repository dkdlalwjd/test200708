import java.util.Scanner;

public class ex0713_test {

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
				
				
				
				
				
			
				int sum = 0;//잔금
				int fiveH =0;//500원, coin500 도 가능
				int oneH = 0;//100원
				int fifty = 0;//50원
				int ten = 0;//10원
				

				for (int i = 0; i<1; i++) {
				
				sum = input /500;//500원 필요 개수
					System.out.println("500원 동전 : "+sum+"개");
					fiveH = input%500;//500원을 먼저 필요한만큼 소진하고 남은 몫

					oneH=fiveH/100;//500원의 몫에서 필요한 백원 개수
					System.out.println("100원 동전 : "+oneH+"개");
					oneH=fiveH%100;//100원을 필요한만큼 소진하고 남은 돈
					
					fifty=oneH/50;
					System.out.println("50원 동전 : "+fifty+"개");
					fifty=oneH%50;//50원을 필요한만큼 소진하고 남은돈
					
					ten = fifty/10;
					System.out.println("10원 동전 : "+ten+"개");
					ten = fifty%10;//10원을 필요한만큼 소진하고 남은돈
					
				}
								
					}//괄호
			}//괄호
