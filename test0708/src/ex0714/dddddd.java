package ex0714;

import java.util.Scanner;

public class dddddd {

	public static void main(String[] args) {
		/*
		 * �������� ���α׷�, 1�� ����: �л��Է�(��ĳ�� ������ �迭����)/�迭�� �������� ���� ���� �ٽ� �޴�. �����Է�, �л������ �Է°���,
		 * 3�� �׳� �Է¹����� ���->�Է��� �迭�� �� 4�� �м��� �ִ밪, ���, �������� ����/ 5�� ����(while run false)
		 * ���� ���� ���α׷��� �ֿ� ��� 1. �л����� �Է� �� ���ִ�. 2. �Է� �� �л������� ������ �Է� �� �� �ֽ��ϴ�. 3. �Է� ��
		 * ������ ��� �Է��Ͻʽÿ�. 4. ������ �ְ���, ��Ȯ�� ����, ��������. 5. ���Ḧ �� ���ִ�. -���� �Է��� ������ �����ϴ� ��
		 */
		Scanner scan = new Scanner(System.in);

		int num = 0;// �л��� ���� ���� �Է�
		
		int[] PeopleNum = null;// ������ �迭 �л��� ����
		boolean run = true;// ���ѹݺ� ����
		int sum = 0;// �հ� ����
		double avg = 0;// ��� ����
		int score = 0;//�����Է� ����
		int count = 0;

		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.���� ");
			System.out.println("-------------------------------------------------------");
			System.out.print("����> ");
			int size = scan.nextInt();// ��� �Է� ����
			int i=0;


			
			
			// 1. �л��� ����
			if (size == 1) {
				System.out.print("�л���> ");
				num = scan.nextInt();
				PeopleNum = new int[num];// �л��� ���� ���� �迭
				
			}

			//2. �����Է� ����
			else if (size == 2) {
				for(i=0; i<PeopleNum.length; i++) {
					System.out.print((i+1)+"�� ° �л����� : "+PeopleNum[i]);
					PeopleNum[i] = scan.nextInt();//�����Է�
					
				}

			}

			
			if (size == 3) {
				for(i=0; i<PeopleNum.length; i++) {
				System.out.println((i+1)+"�� ° �л����� : "+PeopleNum[i]);
				}
			}
			
			
			//4.�м�
			else if (size == 4) {
				int max = PeopleNum[0];

				System.out.print("�ְ����� : ");
				for(int j=0; j<PeopleNum.length; j++) {
					if(max<PeopleNum[j]) {
						max=PeopleNum[j];
						System.out.println(max);
					}
				
						
						
					}
				for(i=0; i<PeopleNum.length; i++) {
					sum= sum+PeopleNum[i];

					}
				
				System.out.println("�հ�: "+sum);
				System.out.println("�л��� : "+(count));
				avg=sum/(i+1);
				System.out.println("������� : "+avg);
				}

			

			// 5. ���� �Է��ϸ� �ݺ��� ��
			else if (size == 5) {
				run = false;
			}

		} // while�� ��ȣ

	}// ��ȣ
}// ��ȣ

