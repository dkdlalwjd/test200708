package ex0714;

public class car_main {

	public static void main(String[] args) {
		// Car Ŭ������ ��ü�� �����Ͽ� 
		// Car Ŭ������ ������ �ִ� �ʵ带 ���
		/*
		 * ��ü ������
		 * '��ü�� ���� Ŭ���� �̸�' ������ = new '��üŬ������ ����������';
		 */
		//CarŬ������ ��ü�� car1�̶�� �̸����� ����
		// car1 : car Ŭ���� Ÿ���� ����
		car car1 = new car();//�⺻���� �մ� ���, �⺻ ������
		// car Ŭ������ ������ �ִ� color �ʵ忡 �� ����
		car1.color = "red";
		//���纻�� �����⿡ �����ʵ忣 ������ ��ġ�� �ʴ´�.
		
		//��ü �ſ� �߿���....
		
		System.out.println(car1.color);
		
		car car2 = new car();
		car2.color = "blue";
		System.out.println(car1.color);//red, car1�� car2�� ���� �Ѹ����� ���� ������ ��ü�� �����, ������� ���纻�̶�
		System.out.println(car2.color);//blue
		
		String var = "";
		var = car1.color;
		System.out.println("var: "+var);
		
		car car3 = null;//�̸��� �ذ���, ��������
		car3 = new car();
		//��ü ����������� �ʵ������Ѱ�
		//car3�� ��� �ʵ尪 ���
		
		System.out.println(car3.color);
		System.out.println(car3.company);//carŬ�������� ������ �⺻���� ��µ�.
		System.out.println(car3.model);
		System.out.println(car3.speed);
		System.out.println(car3.type);

	//	int num;//���� �����Ҷ� �ƹ����� ���ְ� �������� ������
		//�ʵ���� �ʱⰪ ���־ ������ ���·� �⺻���� ��������.
	//	System.out.println(num);
		
		car3.company = "���̹�";//�ʱⰪ�� �־�� �ʿ��Ҷ� ���� ������� �ٲܼ� �ִ�. 
		System.out.println(car3.company);
		
		//�Ű������� �ִ� �����ڸ� Ȱ���Ͽ� ��ü ����
		car car4 = new car("���̹���?");
		System.out.println(car4.color);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.speed);
		System.out.println(car4.type);
		
		
	}

}
