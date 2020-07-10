package test0708;

import java.util.Scanner;

public class ex0709_array2 {

	public static void main(String[] args) {
		// 크기가 5인 정수형 배열을 선언하여 값을 스캐너로 입력
				// 입력된 값들의 총합과 평균을 구하시오.
				//배열에다 스캐너로 값을 하나하나 입력
		
		int [] num = new int[5];//num에는 값을 담을수있는칸이 5칸
		Scanner sc = new Scanner(System.in);
		//int input = 0;//스캐너 입력값
		
		int sum = 0;//합계
		int avg = 0;//평균
		//반복문을 이용하여 배열에 접근
		
		//정수형 변수 i(=0)선언, i는 5개의 배열이 있음, i는 증감함
			for (int i=0; i<num.length; i++) {
				System.out.print("입력 : ");
				num[i] = sc.nextInt();//스캐너 입력값

				sum = sum+num[i];//합계 = 스캐너입력값을 더하면됨

			}
			System.out.println("★합계 : "+sum);
			avg=sum/num.length;//평균=합계/배열 변수 num는 5개임

			System.out.println("★평균 : "+avg);
System.out.println();

	}

}
