package Car_0716;

public class Car {

	int gas;//정수형 필드 gas선언
	//리턴X, setGas: 메소드, 매개변수:정수형 gas선언
	
	//생성자선언
	Car(int gas){
		this.gas = gas;
	}
	
	void setGas(int gas) {
		this.gas = gas;//gas는 gas 라고 사용할수있게 선언
//전달받은값을 필드에 저장
	}
	//bool타입 isLeftGas생성자 선언
	boolean isLeftGas() {
		//만약 가스는 0이라면 "gas가 없습니다."출력, 출력되면 반복 멈추기
		if (gas ==0) {
			System.out.println("gas가 없습니다.");
			return false;
		} else {
			//그외에는 다 "gas가 있습니다."로 무조건 실행
			System.out.println("gas가 있습니다.");
			return true;
		}
	}
	//리턴없음, run호출
	void run() {
		boolean run = true;
		//run은 무조건 실행, true임

		//while문 조건은 반복실행
		while (run) {
			//만약 가스가 0보다 크면 프린트문 출력하고, -1하기
			if (gas>0) {
				System.out.println("달립니다.(gas 잔량 : "+gas+")");
				gas -=1;
				
				//가스가 0보다 크지 않으면 멈춥니다 출력하고 반복 멈춰
			} else {
				System.out.println("멈춥니다.(gas 잔량 : "+gas+")");
				run = false;
				//if else 쓰는경우 리턴이 필요!
			}			
		}
	}
}
