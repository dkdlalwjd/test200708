package ex0713;

import java.util.Scanner;

public class ex0713_ddddd {

	public static void main(String[] args) {
		// 2���� �迭
		Scanner scan = new Scanner(System.in);
		String [][]word = new String[5][2];
		String words[][] = {{"chair", "����"},
				 {"desk", "å��"},
				 {"water","��"},
				 {"pencil","����"},
				 {"watch","�ð�"}};
			 String [] num = {"����1. ","����2. ","����3. ","����4. ","����5. "};
		 		String str = "";
			 String[] english = {"chair","desk","water","pencil","watch"};
			 String [] meaning	= {"����","å��","��","����","�ð�"};
			 int i=0;
				double sum = 0;
				double count=0;
				double avg = 0;
				
		for (i = 0; i <words.length; i++) {
		
			//for (int j = 0; j <words.length; j++) {
				System.out.print(num[i] +english[i]+ "�� ���� �����ΰ���? ");

				str = scan.next();
				if(str.equals(meaning[i])) {
					System.out.println("�����Դϴ�.");
					count++;
}
				
					else {System.out.println("Ʋ�Ƚ��ϴ�."+"\t");
							System.out.println("������ "+ meaning[i]);
							
							if(str.equals(meaning[i])) {
								sum=sum+i;
							}
					//}	
				}
			}
		avg = 5 / count;
		System.out.println("�� "+count+"�� �����Դϴ�.");
		System.out.println("������� "+ avg  + "% �Դϴ�.");
		}
	}


