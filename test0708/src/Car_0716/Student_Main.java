package Car_0716;

import java.util.Scanner;

public class Student_Main {

	public static void main(String[] args) {
		// 메인클래스
		
		//StudentDTO2 타입의 변수 stu1선언
		StudentDTO2 stu1 = null;
		//stu1.name = "회원1";
		// set 메소드를 이용하여 name 필드에 값 저장
	//	stu1.setName("회원1");
	//	System.out.println(stu1.name);
		// get 메소드를 이용하여 name 필드에 값 출력
		//System.out.println(stu1.getName());

		//모든 필드에 대한 겟 셋 지정
		
		
		
		int num = 0;
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		String name = "";
		String address = "";
		String phone = "";
		String [] num2 = new String[name.length()];

		
		//StudentDTO 클래스는 stu로 지정하고, 값은 비었다.
		Student stu = null;
		Application app = new Application();//2.출석체크
		Application check = new Application();//3.내정보확인
		
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.신규등록 | 2.출석체크 | 3.내정보확인 | 4.정보수정 | 5.종료 |6.DTO 클래스를 이용한 객체선언");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scan.nextInt();
			
					
					
			switch(selectNo) {
			case 1:
				System.out.print("이름 : ");
				name = scan.next();
				System.out.print("주소 : ");
				address = scan.next();
				System.out.print("전화번호 : ");
				phone = scan.next();
				
				stu = new Student(name, address, phone);
				break;
				
			case 2:
				app.enter(stu);//출석체크하는 엔터
				
				break;
				
			case 3://내정보확인, 객체에 담긴모든 필드값 출력
				//for(int i = 0; i<num2.length; i++) {
					
					app.view(stu);
					
					System.out.println("이름 : "+stu.name);
					System.out.println("주소 : "+stu.address);
					System.out.println("전화번호 : "+stu.phone);
				//}
				
				break;
				
			case 4://정보수정
				//주소를 서울특별시로 바꾸고 모든 필드값 출력
				//if (stu.address.equals("인천광역시"))
				//	System.out.println("이름 : "+stu.name);
					//System.out.println("주소 : 서울특별시");
					//System.out.println("전화번호 : "+stu.phone);

					app.change(stu);
				break;
				
			case 6:
					//DTO
				stu1 = new StudentDTO2();
				System.out.print("이름 : ");
				name = scan.next();
				System.out.print("주소 : ");
				address = scan.next();
				System.out.print("전화번호 : ");
				phone = scan.next();
				
				// stu1을 StudentDTO2클래스의 객체로 생성
				stu1 = new StudentDTO2();
				stu1.setName(name);
				stu1.setAddress(address);
				stu1.setPhone(phone);
				
				break;
			
			}
					
			
			
		}//while문
				
		
		
	}

}
