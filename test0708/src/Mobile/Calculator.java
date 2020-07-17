package Mobile;

public class Calculator {

	/*
	 * 덧셈 메소드 선언
	 * 리턴 : 없음
	 * 매개변수 : 정수형 변수 2개
	 * 메소드 이름 : sum
	 * 메소드 수행 내용 : 매개변수 2개의 합 출력
	 */
	
	//리턴이 없을땐 void 씀,리턴이 없는 sum 정의함
	void sum(int num1, int num2){
		
		System.out.println(num1+num2);
	}
	
	
	/*
	 * 리턴 : 정수값 리턴
	 * 매개변수 : 정수형 변수 2개
	 * 메소드 이름 : sum1
	 * 메소드 수행내용 :
	 *  - 매개변수 2개의 합 계산
	 *  - 합산 결과 리턴
	 */
	
	//sum이라는 정수형 변수 썻음, 넘겨받은 넘1 넘2 더한 결과과 섬임
	int sum1(int num1, int num2) {
		int sum = num1 + num2;
		return sum;//썸이라는 변수에 담긴값을 넘겨줘라, 나를 호출한 곳에 값을 준다.
		
		
	}
}
