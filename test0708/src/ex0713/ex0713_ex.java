package ex0713;

import java.util.Scanner;

public class ex0713_ex {

	public static void main(String[] args) {
		// ���� ����, 4�� ������ �ٴѴ��ϰ�, ������ �Ҽ���(dou)/�հ� ��� ���ϱ�, 2���� �迭��
		// ���� �����, ��ĳ�ʷ� �迭�� �ֱ�, �װ����� �հ� ��� ���ϱ�
		Scanner scan = new Scanner(System.in);

		double avg = 0;//���
//��=����, ��=����
		double[][] scores = new double[4][2];
		double sum = 0;//�հ�
		System.out.println("������ �Է��ϼ���");
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print((i + 1) + "�г�" + (j + 1) + "�б� : ");
				scores[i][j] = scan.nextDouble();
				sum = sum +scores[i][j];
			//count++;
			}
		}
		System.out.println("���� : "+sum);
		//avg = sum/8;
		avg = sum/(scores.length*scores[0].length);
		System.out.println("��� : "+avg);
//avg = sum/count;
	}

}
