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

		///////////////////////////////////
		// ũ�Ⱑ 5�� �迭�� �����ϰ�, ���� ��ĳ�ʷ� �Է�, �� ������ ���� ū�� ���
				int []num = new int [5];//ũ�� 5�� num �迭 ����
				int max = num[0];
				
					Scanner scan = new Scanner(System.in);
				

					for(int i=0; i<num.length; i++) {
						System.out.print("�����Է� : ");
						num[i] = scan.nextInt();
						
						if(max<num[i]) {
							max=num[i];
						}
				}

					System.out.println("���ִ� : "+max);
			}
	////////////////////////////////////////
	// advanced for(����  for)
	// foreach
	int[] num = {1,2,3,4,5};
	
	//num[]�� ����Ҷ� ���1
	for(int i=0; i<num.length; i++) {
		System.out.println(" "+num[i]);
		
	}
	//foreach ���2
	for(int a:num) {
		System.out.print(" "+a);
	}
	////////////////////////////////////////
	// ���� 5�� �ִ�  String �迭�� �����ϰ�
			// foreach�� �̿��Ͽ� �迭�� ����� ���� ��� ����϶�
			
			System.out.println("[String���� �� foreach�� ����ϱ�]");
			String animal[] = {"�����", "������", "ȣ����" ,"�䳢","��"};//
			
			//�ݺ��ؼ� �����ϰ��� �ϴ� ����� ����
			for(String a:animal) {
				System.out.print(a+",");
				
				//���������߿� �Է��� �ް� �� ���ڰ� ���° ��ġ���� ����ϱ�
				//////////////////////////////
		
		
		
		
		
	}

}
