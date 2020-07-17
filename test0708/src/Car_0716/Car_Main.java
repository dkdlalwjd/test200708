package Car_0716;

public class Car_Main {

	public static void main(String[] args) {
		// 메인클래스
		
		Car car =  new Car(5);//카 클래스에서 매개변수 car선언, 
		System.out.println("가스를 주입해주세요 : ");
		//car.setGas(gas);
		car.setGas(5);//car인데 setGas 인데 매개값 5호출, 가스 필드에 5라는 값 셋팅
		boolean gasState = car.isLeftGas();//bool 매개변수 gasState는 isLeftGas선언
		System.out.println(car.gas);//가스5출력
		if(gasState) {
			//만약  gasSt면 출발 출력
			System.out.println("출발");
			car.run();
		}
	}
}
