package ex0714;

public class ex0714_qqq {

	public static void main(String[] args) {
		/*
		 * 형변환
		 * 특정 타입의 변수를 다른 타입의 변수로 변환하는 것
		 * 1. 자동형변환
		 * - 크기가 작은 타입이 큰 타입으로 변환
		 * 2. 강제형변환
		 * - 크키가 큰 타입이 작은 타입으로 변환
		 */
		//int < double(크기)
		int intVar = 10;
		double doubleVar = 1.0;
		System.out.println("초기값");
		System.out.println("int : "+intVar);//10
		System.out.println("dou : "+doubleVar);//1.0
		
		doubleVar = intVar;//자동형변환, 문제없음
		System.out.println("자동형변환 후");
		System.out.println("int : "+intVar);//10
		System.out.println("dou : "+doubleVar);//10.0
		
		intVar = (int) doubleVar;//강제 형변환 발생, 앞 괄호안에 변수타입 써있음
		// (int) 이거 있으면 강제형변환임을 알아야함.
		System.out.println("강제 형변환 후");
		System.out.println("int : "+intVar);//10
		System.out.println("dou : "+doubleVar);//10.0
		
		int intV = 12;
		double douV = 1.3;
		douV = intV;
		System.out.println("int "+intV +" / "+ douV);

	}

}
