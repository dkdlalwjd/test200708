package test0708;

public class ex0709_2 {

	public static void main(String[] args) {
		// ������ �迭���� ����
		int[] number;//�ΰ��� �����
		int number1[];
		
		//�迭 �����ϸ鼭 �ʱⰪ ����
		int[] number2 = {1,2,3,4};
		//�迭�� ����� ������ ���
		System.out.println(number2[0]);//1
		System.out.println(number2[1]);//2
		System.out.println(number2[2]);//3
		System.out.println(number2[3]);//4
		
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		//Strng Ÿ�� �迭�� �����Ͽ� ���� �ٿ� ���� 4���� �̸��� �����ϰ� ���
		
		System.out.println("������ 4��");
		String[] str = {"������", "������", "�����" ,"�ֿ���"};//
		
		str[3] = "�ں���";
		String n = "";
		n = "���缮";
		str[2] = n;

		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		//�ڡ�str�迭�� ũ��� 4, ������ �ε����� 3�ڡ�
		
		//�迭�� ũ�Ⱚ Ȱ���ϱ�-����ϱ�
		System.out.println(str.length);
		//for���� �̿��Ͽ� �迭�� ����� �� ��� ����ϱ�
		
		System.out.println("for�� �̿�");
		//for(int i=0; i<1; i++) {
			for(int i=0; i<str.length; i++) {
//�迭�� ���Ͱ��� ��
			System.out.println("������");
			System.out.println("������");
			System.out.println("�����");
			System.out.println("�ֿ���");
			System.out.println("mmmmmmmmmmmmmmm");
		}
			for(int j=0; j<=3; j++) {
				System.out.println(str[j]);
		}
		/////////////////////////////////////
			int[] num3;
			//�����ϸ鼭 ���� �������� �ʴ� �迭
			num3 = new int[3];
			int[] num4 = new int[3];//ũ��3
			System.out.println(num4.length);//�ε���4
			
			for(int c=0; c<num4.length; c++) {
				System.out.println(num4[c]);
			}
			
			num3[0]=1;

		
		
	}

}
