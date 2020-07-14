package ex0713;

import java.util.Scanner;

public class ex0713_ex {

	public static void main(String[] args) {
		// 총점 계산기, 4년 대학을 다닌다하고, 학점은 소수점(dou)/합계 평균 구하기, 2차원 배열로
		// 몇행 몇열인지, 스캐너로 배열값 넣기, 그값으로 합계 평균 구하기
		Scanner scan = new Scanner(System.in);

		double avg = 0;//평균
//행=세로, 열=가로
		double[][] scores = new double[4][2];
		double sum = 0;//합계
		System.out.println("성적을 입력하세요");
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print((i + 1) + "학년" + (j + 1) + "학기 : ");
				scores[i][j] = scan.nextDouble();
				sum = sum +scores[i][j];
			//count++;
			}
		}
		System.out.println("총합 : "+sum);
		//avg = sum/8;
		avg = sum/(scores.length*scores[0].length);
		System.out.println("평균 : "+avg);
//avg = sum/count;
	}

}
