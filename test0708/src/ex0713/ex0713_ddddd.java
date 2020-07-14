package ex0713;

import java.util.Scanner;

public class ex0713_ddddd {

	public static void main(String[] args) {
		// 2차원 배열
		Scanner scan = new Scanner(System.in);
		String [][]word = new String[5][2];
		String words[][] = {{"chair", "의자"},
				 {"desk", "책상"},
				 {"water","물"},
				 {"pencil","연필"},
				 {"watch","시계"}};
			 String [] num = {"문제1. ","문제2. ","문제3. ","문제4. ","문제5. "};
		 		String str = "";
			 String[] english = {"chair","desk","water","pencil","watch"};
			 String [] meaning	= {"의자","책상","물","연필","시계"};
			 int i=0;
				double sum = 0;
				double count=0;
				double avg = 0;
				
		for (i = 0; i <words.length; i++) {
		
			//for (int j = 0; j <words.length; j++) {
				System.out.print(num[i] +english[i]+ "의 뜻은 무엇인가요? ");

				str = scan.next();
				if(str.equals(meaning[i])) {
					System.out.println("정답입니다.");
					count++;
}
				
					else {System.out.println("틀렸습니다."+"\t");
							System.out.println("정답은 "+ meaning[i]);
							
							if(str.equals(meaning[i])) {
								sum=sum+i;
							}
					//}	
				}
			}
		avg = 5 / count;
		System.out.println("총 "+count+"개 정답입니다.");
		System.out.println("정답률은 "+ avg  + "% 입니다.");
		}
	}


