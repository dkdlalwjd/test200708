package test0708;

import java.util.Scanner;

public class ex0709_3 {

	public static void main(String[] args) {
		// 크기가 4인 정수형 배열을 선언하여 값을 스캐너로 입력
		// 입력된 값들의 총합과 평균을 구하시오.
		//배열에다 스캐너로 값을 하나하나 입력
		
		int [] num = new int[4];
		int sum=0;
		int avg=0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<num.length; i++) {
			
			System.out.print("입력 : ");
			num[i] = scan.nextInt();
			
			sum = sum+num[i];
			avg = sum/num.length;
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);

		
		
		
		
		
		
	}

}
