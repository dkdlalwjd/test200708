package ex0714;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ex0714_test {

	public static void main(String[] args) {
		/*
		 * 성적관리 프로그램, 1번 선택: 학생입력(스캐너 값으로 배열생성)/배열은 전역변수 선언 그후 다시 메뉴. 점수입력, 학생수대로 입력가능,
		 * 3번 그냥 입력받은값 출력->입력은 배열에 들어감 4번 분석은 최대값, 평균, 내림차순 정렬/ 5번 종료(while run false)
		 * 성적 관리 프로그램의 주요 기능 1. 학생수를 입력 할 수있다. 2. 입력 한 학생수없이 성적을 입력 할 수 있습니다. 3. 입력 한
		 * 성적을 모두 입력하십시오. 4. 성적의 최고점, 정확한 점수, 내림차순. 5. 종료를 할 수있다. -성적 입력은 성능을 제공하는 것
		 */
		Scanner scan = new Scanner(System.in);
		int num = 0;// 학생수 선택 숫자 입력
		int[] PeopleNum = null;// 정수형 배열 학생수 선언
		boolean run = true;// 무한반복 변수
		int sum = 0;// 합계 변수
		double avg = 0;// 평균 변수

		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택> ");
			int size = scan.nextInt();// 기능 입력 변수
			int i = 0;

			// 1. 학생수 선택(배열크기지정)
			if (size == 1) {
				System.out.print("학생수> ");
				num = scan.nextInt();
				PeopleNum = new int[num];// 학생수 지정 가능 배열
			}

			// 2. 점수입력 선택, 스캔을 입력하여 배열값 저장
			else if (size == 2) {
				for (i = 0; i < PeopleNum.length; i++) {
					System.out.print((i + 1) + "번 째 학생점수 : ");
					PeopleNum[i] = scan.nextInt();// 점수입력
				}
			}
			// 3. 점수리스트
			if (size == 3) {
				for (i = 0; i < PeopleNum.length; i++) {
					System.out.println((i + 1) + "번 째 학생점수 : " + PeopleNum[i]);
				}
			}

			// 4.분석(최고점, 평균, 내림차순)
			else if (size == 4) {
				int max = PeopleNum[0];
				System.out.print("최고점수 : ");
				for (int j = 0; j < PeopleNum.length; j++) {
					if (max < PeopleNum[j]) {
						max = PeopleNum[j];
						System.out.println(max);
					}
				} for (i = 0; i < PeopleNum.length; i++) {
					sum = sum + PeopleNum[i];
				}

				avg = sum / PeopleNum.length;
				System.out.println("평균점수 : " + avg);
				System.out.println("내림차순 정렬");
				Arrays.sort(PeopleNum);
				for (i = (PeopleNum.length) - 1; i >= 0; i--) {
					System.out.println(PeopleNum[i]);
					
				
				}
			}

			// 5. 종료 입력하면 반복문 끝
			else if (size == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}
		} // while문 괄호
	}// 괄호
}// 괄호
