package Mobile;

public class MobileMain {

	public static void main(String[] args) {
		// 메인클래스
		//기본 생성자를 이용한 Moblie 객체 생성
		
		Mobile mobile1 = new Mobile();
		mobile1.company = "애플";
		mobile1.model = "아이폰11pro";
		mobile1.color = "black";
		mobile1.type = 5;
		
		
		Mobile mobile2 = new Mobile();
		mobile2.model = "s20";
		mobile2.color = "red";
		mobile2.type = 5;
		System.out.println(mobile2.color);
		System.out.println(mobile2.model);
		System.out.println(mobile2.company);
		System.out.println(mobile2.type);
		
		//객체를 만들때 필드 정보를 함께 저장하고자 할때
		//매개변수가 있는 생성자를 사용
		
		Mobile mobile3 = new Mobile();
		
		//모든 필드를 매개변수로 하는 생성자를 이용한 객체 생성
		Mobile mobile4 = new Mobile("삼성","노트10","black",5);
		//-> 여기 입력한건 Mobile 클래스의 company에 들어감, 순서대로 입력해야함
		//매개변수에서 정하는대로 객체를 생성해야함
		
		//Mobile mobile4 = new Mobile("삼성","노트10","black",5);-> 오류남, 이유 : int와 변수타입에 맞게 써야함.

		System.out.println("mobile4:"+mobile4.color);
		System.out.println(mobile4.model);
		System.out.println(mobile4.company);
		System.out.println(mobile4.type);
		
		mobile4.model = "노트10plus";
		System.out.println(mobile4.model);
		//필드값은 고정이 아니라 변할수있음
		
		

	}

}
