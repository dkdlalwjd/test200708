package test0708;

public class ex0709_array {

	public static void main(String[] args) {
		// 크기가 5인 정수형 배열을 선언하여 값을 알아서 입력하고
		// 입력된 값들의 총합과 평균을 구하시오.
		//배열에다 스캐너로 값을 하나하나 입력
		
		int [] num = new int[5];
	
		int[] num2 = {2,2,3,4,5};
		
		int sum = 0;//합계
		int avg = 0;//평균
		//반복문을 이용하여 배열에 접근
		for (int j=0; j<num.length; j++) {
		//	sum = sum+1;
		//	sum = sum+2;
		//	sum = sum+3;
		//	sum = sum+4;
		//	sum = sum+5;
			sum = sum +num2[j];

		}
	System.out.println(sum);
	avg= sum/num2.length;//평균
	System.out.println(avg);
		
		
		

	}

}
