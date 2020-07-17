package Car_0716;

import java.util.Date;

public class Application {

	public void enter(Student stu) {

		// 두번째 클래스

		System.out.println("Application 클래스의 enter 메소드");
		System.out.println(stu.name + " 님 입실완료 ");
		// 객체의 stu인데, name데이터 출력
		System.out.println("입실시간 : " + new Date());

	}

	public void view(Student stu) {
		System.out.println("정보확인 메뉴 실행");
		System.out.println(stu.toString());
	}

	public void change(Student stu) {
		System.out.println("정보수정");
		stu.address="서울특별시";
//		System.out.println("이름 : "+stu.name);
//		System.out.println("주소 : "+stu.address);
//		System.out.println("전화번호 : "+stu.phone);
		System.out.println(stu.toString());
	}

}
