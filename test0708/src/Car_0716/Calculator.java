package Car_0716;

import java.util.Scanner;

public class Calculator {

	// ���� 5+5
	// ���� ����������� �Է��ؼ� ��� ���
	// ���� /�޼ҵ� ȣ���ؼ� ������, ����, ������ �޼ҵ� ȣ��
	Scanner scan = new Scanner(System.in);

	int num;// ��ȣ ���� ����
	int num2;// �Է¼���1
	int num3;// �Է¼���2

	// �⺻������ ����
	Calculator() {
	}

	boolean input() {
		boolean run = true;

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.���� | 2.���� | 3.���� | 4.������ | 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("����> ");

			num = scan.nextInt();

			// 1. ����
			if (num == 1) {
				// add = num;
				// System.out.println(add);
				// System.out.println("���� ��� : "+add);
				System.out.print("�����Է� : ");
				num2 = scan.nextInt();
				System.out.print("�����Է� : ");
				num3 = scan.nextInt();
				System.out.println("���� ��� : " + (num2 + num3));

			}

			// 2. ����
			else if (num == 2) {
				System.out.print("�����Է� : ");
				num2 = scan.nextInt();
				System.out.print("�����Է� : ");
				num3 = scan.nextInt();
				System.out.println("���� ��� : " + (num2 - num3));

			}

			// 3. ����
			else if (num == 3) {
				System.out.print("�����Է� : ");
				num2 = scan.nextInt();
				System.out.print("�����Է� : ");
				num3 = scan.nextInt();
				System.out.println("���� ��� : " + (num2 * num3));
			}

			// 4. ������
			else if (num == 4) {
				System.out.print("�����Է� : ");
				num2 = scan.nextInt();
				System.out.print("�����Է� : ");
				num3 = scan.nextInt();
				System.out.println("������ : " + (num2 / num3));

				// 5. ����
			} else if (num == 5) {

				run = false;
				System.out.println("���α׷� ����");
			}

		}
		return true;

	}

}
