package test0708;

import java.util.Scanner;

public class ex0709_array2 {

	public static void main(String[] args) {
		// ũ�Ⱑ 5�� ������ �迭�� �����Ͽ� ���� ��ĳ�ʷ� �Է�
				// �Էµ� ������ ���հ� ����� ���Ͻÿ�.
				//�迭���� ��ĳ�ʷ� ���� �ϳ��ϳ� �Է�
		
		int [] num = new int[5];//num���� ���� �������ִ�ĭ�� 5ĭ
		Scanner sc = new Scanner(System.in);
		//int input = 0;//��ĳ�� �Է°�
		
		int sum = 0;//�հ�
		int avg = 0;//���
		//�ݺ����� �̿��Ͽ� �迭�� ����
		
		//������ ���� i(=0)����, i�� 5���� �迭�� ����, i�� ������
			for (int i=0; i<num.length; i++) {
				System.out.print("�Է� : ");
				num[i] = sc.nextInt();//��ĳ�� �Է°�

				sum = sum+num[i];//�հ� = ��ĳ���Է°��� ���ϸ��

			}
			System.out.println("���հ� : "+sum);
			avg=sum/num.length;//���=�հ�/�迭 ���� num�� 5����

			System.out.println("����� : "+avg);
System.out.println();

	}

}
