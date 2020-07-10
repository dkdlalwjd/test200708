package test0710;

import java.util.Scanner;

public class ex0710_2 {

	public static void main(String[] args) {
		// 크기가 5인 배열을 선언하고, 값은 스캐너로 입력, 그 값에서 제일 큰값 출력
		int []num = new int [5];//크기 5인 num 배열 선언
		int max = num[0];
		
			Scanner scan = new Scanner(System.in);
		

			for(int i=0; i<num.length; i++) {
				System.out.print("숫자입력 : ");
				num[i] = scan.nextInt();
				
				if(max<num[i]) {
					max=num[i];
				}
		}

			System.out.println("★최댓값 : "+max);
	}
		
	}


