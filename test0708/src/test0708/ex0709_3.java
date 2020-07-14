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

		///////////////////////////////////
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
	////////////////////////////////////////
	// advanced for(향상된  for)
	// foreach
	int[] num = {1,2,3,4,5};
	
	//num[]을 출력할때 방법1
	for(int i=0; i<num.length; i++) {
		System.out.println(" "+num[i]);
		
	}
	//foreach 방법2
	for(int a:num) {
		System.out.print(" "+a);
	}
	////////////////////////////////////////
	// 값이 5개 있는  String 배열을 선언하고
			// foreach를 이용하여 배열에 저장된 값을 모두 출력하라
			
			System.out.println("[String글자 를 foreach로 출력하기]");
			String animal[] = {"고양이", "강아지", "호랑이" ,"토끼","양"};//
			
			//반복해서 접근하고자 하는 대상을 쓰기
			for(String a:animal) {
				System.out.print(a+",");
				
				//고정숫자중에 입력을 받고 그 숫자가 몇번째 위치인지 출력하기
				//////////////////////////////
		
		
		
		
		
	}

}
