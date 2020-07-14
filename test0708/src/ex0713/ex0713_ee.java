package ex0713;

import java.util.Scanner;

public class ex0713_ee {

	public static void main(String[] args) {
		
		String words[][] = {{"chair", "의자"},
				 {"desk", "책상"},
				 {"water","물"},
				 {"pencil","연필"},
				 {"watch","시계"}};
		double score = 0;
		Scanner scan = new Scanner(System.in);

		for(int i=0; i<words.length; i++) {
			System.out.println("문제"+(i+1)+". "+words[i][0]+"의 뜻은 무엇입니까?");
		String answer = scan.next();
		if(answer.equals(words[i][1])) {
			System.out.println("정답입니다.");
			score++;
		}
		else {
			System.out.println("틀렸습니다.");
			System.out.println("정답은 "+words[i][1]+"입니다.");
		}
			
			
		}
		System.out.println("총 "+score+"개 정답입니다." );
		double percent =100*(score/words.length);
		System.out.println("정답률은 "+percent+ "% 입니다.");
		}
}// 필요괄호
