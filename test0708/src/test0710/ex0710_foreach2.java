package test0710;

public class ex0710_foreach2 {

	public static void main(String[] args) {
		// 값이 5개 있는  String 배열을 선언하고
		// foreach를 이용하여 배열에 저장된 값을 모두 출력하라
		
		System.out.println("[String글자 를 foreach로 출력하기]");
		String animal[] = {"고양이", "강아지", "호랑이" ,"토끼","양"};//
		for(String a:animal) {
			System.out.println(a);
		}

	}

}
