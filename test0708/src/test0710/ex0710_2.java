package test0710;

import java.util.Scanner;

public class ex0710_2 {

	public static void main(String[] args) {
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
		
	}


