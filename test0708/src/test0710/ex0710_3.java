package test0710;

import java.util.Arrays;

public class ex0710_3 {

	public static void main(String[] args) {
		// 오름차순정렬 num = {3,2,1,5,4}처음두개 크기비교해서 제일 작은게 먼저 위로옴,서로 위치바꿀 변수필요
		//최종값은 {1,2,3,4,5}-> Bubble정렬 이라고도함
		//값을 두개만 있는 배열의 위치만 바꺼보기, 그리고 추가
		System.out.println("[오름차순 정렬]");

		int [] num = {3,2,1,5,4};
		int [] num2 = {3,2,1,5,4};

		int temp = 0;//자리바꿈할때 임시저장용
		
		/*
		 * 1회차반복 : 0,1 0,2 0,3 0,4
		 * 2회차반복 : 1,2 1,3 1,4
		 * 3회차반복 : 2,3 2,4
		 * 4회차반복 : 3,4
		 */
		
		
		System.out.println("정렬전 : "+num[0]+" "+num[1]+" "+num[2]+" "+num[3]+" "+num[4]);
		
			for (int i=0; i<num.length; i++) {
				for(int j=i+1; j<num.length; j++) {
					if(num[i]>num[i]) {
						temp=num[j];
						num[i] = num[j];
						num[j] = temp;
					}
						}
					}
					for(int i=0; i<num.length; i++)	{
						System.out.print(num[i]);
				
				
				
				Arrays.Sort(num2);
				for
			}//for 괄호
			
			
			
				
		}//메인메소드 괄호
	}//큰메소드 괄호


