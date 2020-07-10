package test0708;

public class ex0709_2 {

	public static void main(String[] args) {
		// 정수형 배열변수 선언
		int[] number;//두가지 방식임
		int number1[];
		
		//배열 선언하면서 초기값 지정
		int[] number2 = {1,2,3,4};
		//배열에 저장된 데이터 출력
		System.out.println(number2[0]);//1
		System.out.println(number2[1]);//2
		System.out.println(number2[2]);//3
		System.out.println(number2[3]);//4
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		//Strng 타입 배열을 선언하여 같은 줄에 앉은 4명의 이름을 저장하고 출력
		
		System.out.println("같은줄 4명");
		String[] str = {"송지혜", "김은비", "김미정" ,"최예림"};//
		
		str[3] = "박보검";
		String n = "";
		n = "유재석";
		str[2] = n;

		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		//★★str배열의 크기는 4, 마지막 인덱스는 3★★
		
		//배열의 크기값 활용하기-출력하기
		System.out.println(str.length);
		//for문을 이용하여 배열에 저장된 값 모두 출력하기
		
		System.out.println("for문 이용");
		//for(int i=0; i<1; i++) {
			for(int i=0; i<str.length; i++) {
//배열은 위와같이 씀
			System.out.println("송지혜");
			System.out.println("김은비");
			System.out.println("김미정");
			System.out.println("최예림");
			System.out.println("mmmmmmmmmmmmmmm");
		}
			for(int j=0; j<=3; j++) {
				System.out.println(str[j]);
		}
		/////////////////////////////////////
			int[] num3;
			//선언하면서 값을 지정하지 않는 배열
			num3 = new int[3];
			int[] num4 = new int[3];//크기3
			System.out.println(num4.length);//인덱스4
			
			for(int c=0; c<num4.length; c++) {
				System.out.println(num4[c]);
			}
			
			num3[0]=1;

		
		
	}

}
