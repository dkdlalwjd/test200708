package test0710;

import java.util.Scanner;

public class ex0710_bbb {

	public static void main(String[] args) {
		//���������߿� �Է��� �ް� �� ���ڰ� ���° ��ġ���� ����ϱ�
		System.out.println("{1, 2, 5, 3, 4, 7, 6, 9, 10, 8}");
		int num[] = {1,2,5,3,4,7,6,9,10,8};
		int input = 0;//�Է¹޴� ������ ����
		int i=0;
		int index = 0;//�ε�����ȣ
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����Է� : ");
		input = scan.nextInt();
		for(i=0; i<num.length; i++) {
			
			if(input==num[i]) {
				//�Է��� ���ڿ� �迭�� ��� �����Ϳ� �������� ���� ��
			System.out.println(i);
			index=i;
			}		
	//for�� ���� �Է¹��� ���ڿ� 0�� �ε����� �Էµ� ���� ������, 1�� �ε����� �ִ� ���� ������ �� ���� ã������ �̰� ���° ĭ����
	//�ε������� �̿��Ҽ����ְ�, +1 �ϸ��
	//ī��Ʈ�ϳ��� �÷��� ���° �ִٰ� ǥ���ص���			
			}
		
		System.out.println(input+"�� "+(index+1)+"��°�� �ֽ��ϴ�.");

		}//����	
//				if(max<num[i]) {
//					max=num[i];
	}//����