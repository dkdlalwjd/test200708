package Mobile;

import java.util.Scanner;

public class Never_Main {

	public static void main(String[] args) {
		// ���� Ŭ����
		
		
		Scanner scan = new Scanner(System.in);
		String str = "";
		
		
		System.out.println("��ü������");
		Naver Naver1 = new Naver();
		System.out.println("��ü������");
		Naver Naver2 = new Naver("ddddd","dd1246333","aadf111","kim","19928","����","dgkdk@mma","01055541");

		
		System.out.println("[Naver ȸ������]"+"\t");
		System.out.print("���̵� : ");
		str = scan.next();
//		System.out.println("@naver.com");
		System.out.print("��й�ȣ : ");
		str = scan.next();
		System.out.print("��й�ȣ ��Ȯ�� : ");
		str = scan.next();
		System.out.print("�̸� : ");
		str = scan.next();
		System.out.print("������� : ");
		str = scan.next();
		System.out.print("����: ");
		str = scan.next();
		System.out.print("����Ȯ���̸���: ");
		str = scan.next();
		System.out.print("�޴���: ");
		str = scan.next();
		
		System.out.println("�����ϱ�");

	}

	@Override
	public String toString() {
		return "Never_Main []";
	}

}
