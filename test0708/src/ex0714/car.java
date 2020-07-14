package ex0714;

public class car {
	//메인 메소드 없음, 메인이 있는 클래스 2개 만듬
	
	/*
	 * 클래스
	 * 클래스 3요소 
	 * 1. 필드(field)
	 * - 데이터를 저장하기 위한 공간
	 * - 변수랑 비슷한 개념
	 * 2. 생성자(constructor)-생성을 도와주는 객체
	 * - 객체를 만들 때 따라야 하는 규정을 정의
	 * - 생성자는 여러개 만들수 있음.
	 * - 생성자는 매개변수가 있을 수도 있고 없을 수도 있음
	 * - 생성자의 이름은 클래스 이름과 동일해야 함
	 * 
	 */
	
	//필드(변수같은것인데 필드
	String color;
	int speed;
	String type;
	String model;
	String company = "카카오";
	
	//기본 생성자 선언
	car(){
		
	}
	
	//매개변수가 있는 생성자 선언
	//매개변수 : model(필드중에 하나를 보통 씀.)
	car(String model){
		//매개변수 타입과 변수이름 들어가야함
	this.model = model;
	//this는 현재클래스의 model필드값 지정한것
	}

	
	
}
