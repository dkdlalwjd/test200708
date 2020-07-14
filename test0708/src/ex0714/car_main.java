package ex0714;

public class car_main {

	public static void main(String[] args) {
		// Car 클래스를 객체로 선언하여 
		// Car 클래스가 가지고 있는 필드를 사용
		/*
		 * 객체 선언방법
		 * '객체로 만들 클래스 이름' 변수명 = new '객체클래스이 생성자형식';
		 */
		//Car클래스의 객체를 car1이라는 이름으로 선언
		// car1 : car 클래스 타입의 변수
		car car1 = new car();//기본으로 잇는 양식, 기본 생성자
		// car 클래스가 가지고 있는 color 필드에 값 대입
		car1.color = "red";
		//복사본을 만들어썻기에 원본필드엔 영향을 미치지 않는다.
		
		//객체 매우 중요함....
		
		System.out.println(car1.color);
		
		car car2 = new car();
		car2.color = "blue";
		System.out.println(car1.color);//red, car1과 car2는 같은 뿌리지만 각자 독립된 객체로 선언됨, 상관없음 복사본이라
		System.out.println(car2.color);//blue
		
		String var = "";
		var = car1.color;
		System.out.println("var: "+var);
		
		car car3 = null;//이름만 준거임, 전역변수
		car3 = new car();
		//객체 여러개만들고 필드지정한것
		//car3의 모든 필드값 출력
		
		System.out.println(car3.color);
		System.out.println(car3.company);//car클래스에서 지정한 기본값이 출력됨.
		System.out.println(car3.model);
		System.out.println(car3.speed);
		System.out.println(car3.type);

	//	int num;//변수 선언할때 아무값도 안주고 값찍으면 오류남
		//필드들은 초기값 안주어도 각각의 형태로 기본값이 잡혀있음.
	//	System.out.println(num);
		
		car3.company = "네이버";//초기값을 주었어도 필요할때 값을 마음대로 바꿀수 있다. 
		System.out.println(car3.company);
		
		//매개변수가 있는 생성자를 활용하여 객체 선언
		car car4 = new car("마이바흐?");
		System.out.println(car4.color);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.speed);
		System.out.println(car4.type);
		
		
	}

}
