package Mobile;

public class Calculator2 {

	//정수형 변수 add를 리턴할건데 정수형 변수 x, y가 매개변수야.
	//x+y는 정수형 result임. result=x+y인거
	
	//add메소드, 리턴타입: int, 매개변수 :정수x,y
	int add(int x, int y) {
		int result = x+y;
		return result;
		//리턴(호출)했고 그건  result야
	}
	//소수점 avg를 선언, 매개변수 그건 정수형인 x, y야
	double avg (int x, int y) {
		double sum = add(x, y);
		//소수점 sum는 x+y(x,y)임
		double result = sum/2;
		return result;//result에 담긴 17을 리턴하는것->호출한 위치로
		//여기서 result는 지역변수라 중복선언이 가능해보이는것
	}
	
	void execute () {
		double result = avg(7,10);
		System.out.println("실행결과:"+result);
		//execute는 리턴없고 매개변수 없구나/매소드 들어와서는 차례차례보고 뭔가 호출되면 다시거기 보기
	}
	
}
