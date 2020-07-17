package Mobile;

public class Student_Main {

	public static void main(String[] args) {
		// Student_Main 메인메소드
		//이 교실의 수강생들을 구성하는 필드를 만들고
		//각각을 객체로 선언, 수강생의 인적사항 같은것
		System.out.println("[수강생 인적사항]");
		
		Student Student1 = new Student();
		Student1.name = "김미정";
		Student1.gender = "여자";
		Student1.age = 29;
		Student1.address = "인천 서구 석남동";
		Student1.exp = false;
		System.out.println(Student1.name+ " : "+ Student1.gender+" / "+ Student1.age+" / "+ Student1.address+" / "+ Student1.exp);

		
		Student Student2 = new Student();
		Student2.name = "김은비";
		Student2.gender = "여자";
		Student2.age = 24;
		Student2.address = "인천 주안동?";
		Student1.exp = false;
		System.out.println(Student2.name+ " : "+ Student2.gender+" / "+ Student2.age+" / "+ Student2.address+" / "+ Student2.exp);

		
		Student Student3 = new Student();
		Student3.name = "송지혜";
		Student3.gender = "여자";
		Student3.age = 23;
		Student3.address = "인천 부평동";
		Student1.exp = false;
		System.out.println(Student3.name+ " : "+ Student3.gender+" / "+ Student3.age+" / "+ Student3.address+" / "+ Student3.exp);

		System.out.println(Student1.toString());

		
		//매개변수가 있는 생성자
		//Student Student4 = new Student();
		Student Student5 = new Student("최예린","여자",21, "인천 옥련동",false, "01022224444");	
		System.out.println("dd"+Student5.toString());
		
		
		
		
		
		
		
		
		
	}

}
