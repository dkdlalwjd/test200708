package ex0713;

import java.util.Scanner;

public class ex0713 {

	public static void main(String[] args) {
		// �ܵ��Ž����ֱ�, ����ū������ �����ϸ鼭 ��������, ������»�Ȳ
		//�迭 Ȱ��, �Ž����� ���ϱ� ����
		//������ ������ ��, ��� ������, ���� �Է¹����� 500�� ������ �����ŷ� 100�� ������ 50�������� 10�� ������
		
		
		System.out.println("[ �ܵ� ��� ���α׷� ]");
		int input = 0;//��ĳ�� �Է°�
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ� �Է� : ");
		input = scan.nextInt();
		
		int [] change = {500, 100, 50, 10};//4������ �ݺ��Ұ�
		int coinCount = 0;//�������� ��¿� ����
		for(int j=0; j<change.length; j++) {
			coinCount = input/change[j];
			System.out.println(change[j]+"�� ���� : "+coinCount+"��");
			input = input % change[j];
		}
						
			}//��ȣ
	}//��ȣ


