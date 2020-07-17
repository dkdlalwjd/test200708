package Mobile;

public class Calculator_Main {

	public static void main(String[] args) {
		//메인 클래스 Calculator:계산기(더하기, 빼기, 나누기 메소드)
		//Calculator 클래스 객체 선언
		Calculator cal = new Calculator();
		
		
		cal.sum(8, 77);//void결과
		int val1 = 10;
		int vai2 = 7;
		cal.sum(val1, vai2);//매소드를 호출하고 두 타입이 맞아야함, int int / double double
		
		Calculator cal2 = new Calculator();
		cal.sum(3344, 3332);

		cal.sum1(5, 3);//리턴
		System.out.println(cal.sum1(8, 12));
	//	System.out.println(20);
		int result1 = cal.sum1(7, 10);
		System.out.println(result1);
		//= 만나면, 무조건 우변부터 보고 결과를 좌변에 집어넣는다.
		
	}

}
