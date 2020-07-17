package Car_0716;

public class StudentDTO2 {

	// 교육원 훈련생 정보를 담을 필드와 모든 필드를 매개변수로 하는 생성자를 선언
	// 클래스 3개만들것

	private String name;// 이름
	private String gender;// 성별
	private String address;// 주소
	private String phone;// 폰번호
	private int age; // 나이
	private boolean exp;// 프로그래밍 경험여부
//public, private: 접근제한자
	// private : 를 치면 지금 클래스만 쓸수있다

	
	
	public void setName2(String name) {
		this.name = name;}
	public String getName2() {
		return name;}
	
	public void setGerder(String gender) {
		this.gender = gender;
	}
	public String getGerder() {
		return gender;
	}
	
	public void setAddress() {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setPhone() {
		this.phone = phone;}
		public String getPhone() {
			return phone;
		}
	
	public void setAge() {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setExp() {
		this.exp = exp;
	}
	public boolean getExp() {
		return exp; 
	}
	
	
	
	
	
	
	
	/*
	 * get, set 메소드 DTO(Date Transfer Object): 데이터를 담아서 전달하기 위한 클래스 사용이유 : 필드에 직접
	 * 접근이 아닌 메소드를 간접 접근하여 필드값 지정 및 수정 get 메소드 : 외부에서 필드값을 쓰고자 할때(가져오다) set 메소드 :
	 * 외부에서 필드값을 지정할때(필드값 출력)
	 * 
	 */
	// nama필드에 대한 get, set 메소드 선언

	public StudentDTO2(String name, String gender, String address, String phone, int age, boolean exp) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.age = age;
		this.exp = exp;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setExp(boolean exp) {
		this.exp = exp;
	}
	// setName -> 처음 소문자 뒤엔 대문자
	public void setName(String name) {
		this.name = name;
		// 매개변수 String name이고 필드에 저장name
	}

	// get이 붙으면 호출한데다 값을 줘야함, 그래서 리턴이 붙음
	// 타입은 메인 필드를 보고 타입을 확인
	public String getName() {
		return name;
	}

	// 기본생성자
	StudentDTO2() {

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", address=" + address + ", phone=" + phone + ", age="
				+ age + ", exp=" + exp + "]";
	}

	// 모든필드를 매개변수로 하는 생성자를 선언
//	public StudentDTO2(String name, String gender, String address, String phone, int age, boolean exp) {
//		super();
//		this.name = name;
//		this.gender = gender;
//		this.address = address;
//		this.phone = phone;
//		this.age = age;
//		this.exp = exp;
		
	

	
	public StudentDTO2(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;

		
		
		
	}
}
