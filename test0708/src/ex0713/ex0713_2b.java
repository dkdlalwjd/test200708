package ex0713;

public class ex0713_2b {

	public static void main(String[] args) {
		// 2행 3열 정수형 배열-> 총 첫재줄 3개, 둘째줄 2개 총 데이터 6개 집어넣을수있음
		//활용도가 높지는 않으나 알고있어야함, 배열은 모든 언어에서 기초내용
		
		int[][] num = new int[2][3];
		System.out.println(num.length);//2차원 배열에서는 배열.렝스 하면 행값 나옴
		System.out.println(num[0].length);//줄별로 관리함, 줄수도 시작은 0임, 인덱스번호 0
		System.out.println(num[1].length);
		
		//3행 3열
		int[][] num2 = new int[3][3];
		System.out.println(num2.length);
		
		//for문을 이용하여 num2에 담긴 모든 값 출력
		for(int i =0; i<num2.length; i++) {
			for(int j=0; j<num2[i].length; j++)
			System.out.print(" num2값 : "+ num2[i][j]);
		}
		
		String[][] str = {{"가","나","다"},{"라","마","바"},{"사","아","자"}};
		//for(int c=0; c<str.length; c++) {
			//System.out.println(str[c]);
		//}
		

		//1행에 1,2,3, 2행에 4,5,6을 대입
		//int [][]num3 = {{1,2,3},{4,5,6}};//한층씩 중괄호로 묶고 , 찍기
		
		
		}

	}


