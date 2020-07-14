package test0710;

import java.util.Scanner;

public class ex0710_bbb {

	public static void main(String[] args) {
		//고정숫자중에 입력을 받고 그 숫자가 몇번째 위치인지 출력하기
		System.out.println("{1, 2, 5, 3, 4, 7, 6, 9, 10, 8}");
		int num[] = {1,2,5,3,4,7,6,9,10,8};
		int input = 0;//입력받는 정수형 숫자
		int i=0;
		int index = 0;//인덱스번호
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력 : ");
		input = scan.nextInt();
		for(i=0; i<num.length; i++) {
			
			if(input==num[i]) {
				//입력한 숫자와 배열에 담긴 데이터와 같은지를 각각 비교
			System.out.println(i);
			index=i;
			}		
	//for를 통해 입력받은 숫자와 0번 인덱스에 입력된 값이 같은지, 1번 인덱스에 있는 값이 같은지 다 보고 찾았으면 이게 몇번째 칸인지
	//인덱스값을 이용할수도있고, +1 하면됨
	//카운트하나씩 늘려서 몇번째 있다고 표현해도됨			
			}
		
		System.out.println(input+"는 "+(index+1)+"번째에 있습니다.");

		}//메인	
//				if(max<num[i]) {
//					max=num[i];
	}//메인