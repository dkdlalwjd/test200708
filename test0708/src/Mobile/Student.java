package Mobile;

public class Student {

	String name;//이름
	String gender;//성별
	int age;//나이
	String address;//주소
	boolean exp;//프로그래밍 경험여부
	String phone;//폰번호->스트링으로 쓰는게 좋음 010000 / 010-541 두가지타입있음
		
	//모든 필드를 매개변수로 하는 생성자
	
//	String(String name, String gender, int age,String address,boolean exp ,String phone)

	Student(){
		
	}//기본생성자임
	
	
@Override
//메소드를 만든것, 필드값을 출력해주는 메소드
	public String toString() {
		return "[name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address + ", exp=" + exp
				+ ", phone=" + phone + "]";
	}

	//우클릭=
	public Student(String name, String gender, int age, String address, boolean exp, String phone) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.exp = exp;
		this.phone = phone;
		
		
		
		
	}}
	
	
	
	
	
	
	

