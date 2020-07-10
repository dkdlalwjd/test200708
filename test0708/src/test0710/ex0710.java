package test0710;

public class ex0710 {

	public static void main(String[] args) {
		//최대값 찾기

		int[] num= {5,10,3,7,2};//값을 주면서 배열선언
//		num[0] = 5;
//		num[1] = 10;
//		num[2] = 3;
//		num[3] = 7;
//		num[4] = 2;
		
		int max = num[0];//max라는 변수 선언, num은 0번째 인덱스와 같다. 
		System.out.println("max: "+max);//max라는 변수는 num의 0번이다. 그래서 5
		
		//for 반복문 시작, 정수형 변수 i 선언(초기값0), i<num길이 만큼=5까지, i는 1씩 증가
		for(int i=0; i<num.length; i++) {
			if(max<num[i]) {
				//만약 max는 num보다 작으면, max는 num[i]이다.
				//0번째 : 5<0 ->성립안됨, 맥스는 그대로 5
				//1번째 : 5<10 -> 성립, 맥스는 10으로 바뀜
				//2번째 : 10<3 -> 성립안됨, 맥스는 10
				//3번째 : 10<7 -> 성립안됨, 맥스는 10
				//4번째 : 10>2 -> 성립안됨, 맥스는 10
				max=num[i];
				//그래서 맥스는 10
			}
		}
		System.out.println("최대값 : "+max);
		
		
			
		}
				
		

		
		
		
		

	}


