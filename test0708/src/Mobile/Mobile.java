package Mobile;

public class Mobile {
	
	
	String company = "삼성";
	String model;
	String color;
	int type;//4g, 5g
	 
	// 모든 필드를 매개변수로 하는 생성자
	//생성자의 이름은 클래스의 이름과 똑같아야 한다.
	
	//기본생성자 양식임,
	//모든 필드를 매개변수로 하는 생성자
	//매개변수: 전달하는 변수/색깔로 구분 /this. 이 붙으면 필드임
	Mobile(String company, String model, String color, int type) {
		
		//전달받은 매개변수에 담긴 값을 각각 필드에 저장
		this.company = company;//this가 붙으면 필드에서 갖고온것
		this.model = model;
		this.color = color;
		this.type = type;
		//클래스에 기본생성자를 정의하면 기본생성자는 여기서는 적용이 안되고 없어진것
		
		
	}
	Mobile (String model, String color, int type){
	this.model = model;
	this.color = color;
	this.type = type;
	//컴퍼니 삼성은 그대로 두고 선언하고 싶을때
	}

	//매개변수없는 기본생성자 선언, 생성자를 여러개 줄수있음
	Mobile(){
		
	}
	

	//생성자 overloading : 생성자를 여러개 생성할수 있음
	//오버로딩이랑 오버라이딩 차이점 알기-면접때 물어볼수있음
	
	

}
