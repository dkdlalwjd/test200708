package test0708;

import java.util.Scanner;

public class ex0709_3 {

	public static void main(String[] args) {
		// ũ�Ⱑ 4�� ������ �迭�� �����Ͽ� ���� ��ĳ�ʷ� �Է�
		// �Էµ� ������ ���հ� ����� ���Ͻÿ�.
		//�迭���� ��ĳ�ʷ� ���� �ϳ��ϳ� �Է�
		
		int [] num = new int[4];
		int sum=0;
		int avg=0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<num.length; i++) {
			
			System.out.print("�Է� : ");
			num[i] = scan.nextInt();
			
			sum = sum+num[i];
			avg = sum/num.length;
		}
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+avg);

		
		
		
		
		
		
	}

}
