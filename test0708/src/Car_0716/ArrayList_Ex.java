package Car_0716;
import java.util.*;

public class ArrayList_Ex {

	public static void main(String[] args) {

		/*
		 * ArrayList, (Set, Map) 이 있음.
		 * ArrayList: 인덱스존재함, 넣는대로 커짐, 집어넣는데이터의 제약이 없음
		 */
		
		// numbers라는 이름의 ArrayList
		
		//List<클래스이름, 저장하고자하는데이터>
		List<Integer> numbers = new ArrayList<Integer>();
		// <> : generic (<>는 괄호임)
		//타입변환을 하지 않고도 해당 타입을 사용할수 있게 해줌
		
		List<String> strs = new ArrayList<String>();
		//어레이리스트에 각각 박스가 생긴거고 거기에 저장되는것
		
		//numbers에 값 저장, add메소드, 10:매개변수(10을 리스트에 저장한다)
		//ArrayList 이름.메소드이름(넣고자 하는 매개변수);
		numbers.add(10);
		
		int num = 100;
		numbers.add(num);
		System.out.println("프린트 "+numbers.add(500));
		numbers.add(1, 99);//numbers의 1번 인덱스에 99라는 값을 저장, 그럼 기존 1번인덱스의 있던 
		//값 100은 2번으로 2번은 3번으로 새치기됨.뒤로 밀림, 그래서 크기가 유동적임
		numbers.add(1, 999);//이렇게 또 넣으면 마지막에 추가한게 1번 인덱스에 들어가고 또 기존값은 뒤로 밀려남
		
		
		//전체 데이터 삭제, numbers의 있는 값이 전부 삭제됨. 앞으로는 .찍고
		//numbers.clear();
		numbers.remove(2);//remove는 하나씩 데이터 삭제하는것, 지워지면 빈자리를 뒤에있는게 땡겨짐, 유동적이 많음
		
		//프린트 출력
		System.out.println(numbers.get(0));//10출력
		System.out.println(numbers.get(1));//100출력
		System.out.println(numbers.get(2));
		
		// ArrayList 크기 출력, 들어있는 데이터 만큼이 어레이리스트의 크기임
		System.out.println(numbers.size());
		
		//for문을 이용하여 ArrayList에 담긴 모든 데이터 출력
		
		System.out.println("for문을 이용하여 ArrayList에 담긴 모든 데이터 출력");
		for(int i=0; i<numbers.size(); i++) {
			System.out.println("인덱스 "+i+" : "+numbers.get(i));
		}
		
		List<String> str2 = new ArrayList<String>();

		str2.add("같이출력");
		
		strs.add("가나라가가가가");//스트링은 더블쿼터로 ""로 넣음
		strs.add("fffff");
		System.out.println(strs);
		System.out.println(strs.size());//strs의 사이즈를 알려주는것
		System.out.println("1 "+strs);
		System.out.println(str2);
		
		List<StudentDTO2> stuList = new ArrayList<StudentDTO2>();
		StudentDTO2 stu = new StudentDTO2();
		stu.setName("회원1");
		stu.setAddress("인천광역시");
		stu.setPhone("010-1212-0022");
		stuList.add(stu);
		System.out.println("stuList.get(0) : "+stuList.get(0));
		System.out.println("getName 출력 : "+stuList.get(0).getName());//개별적인 필드값 출력, 정확한 확인을 위해
		
		StudentDTO2 stu1 = new StudentDTO2();
		stu1.setName("회원2");
		stu1.setAddress("서울시");
		stu1.setPhone("010-2455-5575");
		stuList.add(stu1);
		System.out.println(stuList.get(1).getName());
		
		for (int i=0; i<stuList.size(); i++) {
			System.out.println("전체 출력 : "+stuList.get(i));
			System.out.println("이름만 출력 : "+stuList.get(i).getName());
			
			
			
		}
		
		//		System.out.println(numbers.get(index번호));
	}
}
