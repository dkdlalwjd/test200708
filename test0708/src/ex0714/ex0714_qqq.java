package ex0714;

public class ex0714_qqq {

	public static void main(String[] args) {
		/*
		 * ����ȯ
		 * Ư�� Ÿ���� ������ �ٸ� Ÿ���� ������ ��ȯ�ϴ� ��
		 * 1. �ڵ�����ȯ
		 * - ũ�Ⱑ ���� Ÿ���� ū Ÿ������ ��ȯ
		 * 2. ��������ȯ
		 * - ũŰ�� ū Ÿ���� ���� Ÿ������ ��ȯ
		 */
		//int < double(ũ��)
		int intVar = 10;
		double doubleVar = 1.0;
		System.out.println("�ʱⰪ");
		System.out.println("int : "+intVar);//10
		System.out.println("dou : "+doubleVar);//1.0
		
		doubleVar = intVar;//�ڵ�����ȯ, ��������
		System.out.println("�ڵ�����ȯ ��");
		System.out.println("int : "+intVar);//10
		System.out.println("dou : "+doubleVar);//10.0
		
		intVar = (int) doubleVar;//���� ����ȯ �߻�, �� ��ȣ�ȿ� ����Ÿ�� ������
		// (int) �̰� ������ ��������ȯ���� �˾ƾ���.
		System.out.println("���� ����ȯ ��");
		System.out.println("int : "+intVar);//10
		System.out.println("dou : "+doubleVar);//10.0
		
		int intV = 12;
		double douV = 1.3;
		douV = intV;
		System.out.println("int "+intV +" / "+ douV);

	}

}
