package Mobile;

public class Naver {
//메인메소드 X
	String id;//아이디
	String password;//비밀번호
	String passwordRe;//비밀번호 재확인
	String name;//이름
	String DateBirth;//생년월일
	String gender; //성별
	String MyConfEmail; //본인 확인 이메일
	String phone;//휴대폰
	
	//메소드 (method)
	//Override 는 상속에서 메소드를 재정리하는 것
	@Override//어노테이션(Annotation)
	public String toString() {
		//리턴이 존재하는 메소드임
		return "Naver [id=" + id + ", password=" + password + ", passwordRe=" + passwordRe + ", name=" + name
				+ ", DateBirth=" + DateBirth + ", gender=" + gender + ", MyConfEmail=" + MyConfEmail + ", phone="
				+ phone + "]";
	}


	public Naver(String id, String password, String passwordRe, String name, String dateBirth, String gender,
			String myConfEmail, String phone) {
		System.out.println("매개변수 있는 생성자 호출");
		//super();
		this.id = id;
		this.password = password;
		this.passwordRe = passwordRe;
		this.name = name;
		DateBirth = dateBirth;
		this.gender = gender;
		MyConfEmail = myConfEmail;
		this.phone = phone;
	}

	
	//기본생성자, 메인에서 쓴다고 한것->객체만들고 이문장 찍음.
	Naver(){
		System.out.println("기본생성자 호출");
	}
}
