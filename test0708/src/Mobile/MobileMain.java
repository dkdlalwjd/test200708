package Mobile;

public class MobileMain {

	public static void main(String[] args) {
		// ����Ŭ����
		//�⺻ �����ڸ� �̿��� Moblie ��ü ����
		
		Mobile mobile1 = new Mobile();
		mobile1.company = "����";
		mobile1.model = "������11pro";
		mobile1.color = "black";
		mobile1.type = 5;
		
		
		Mobile mobile2 = new Mobile();
		mobile2.model = "s20";
		mobile2.color = "red";
		mobile2.type = 5;
		System.out.println(mobile2.color);
		System.out.println(mobile2.model);
		System.out.println(mobile2.company);
		System.out.println(mobile2.type);
		
		//��ü�� ���鶧 �ʵ� ������ �Բ� �����ϰ��� �Ҷ�
		//�Ű������� �ִ� �����ڸ� ���
		
		Mobile mobile3 = new Mobile();
		
		//��� �ʵ带 �Ű������� �ϴ� �����ڸ� �̿��� ��ü ����
		Mobile mobile4 = new Mobile("�Ｚ","��Ʈ10","black",5);
		//-> ���� �Է��Ѱ� Mobile Ŭ������ company�� ��, ������� �Է��ؾ���
		//�Ű��������� ���ϴ´�� ��ü�� �����ؾ���
		
		//Mobile mobile4 = new Mobile("�Ｚ","��Ʈ10","black",5);-> ������, ���� : int�� ����Ÿ�Կ� �°� �����.

		System.out.println("mobile4:"+mobile4.color);
		System.out.println(mobile4.model);
		System.out.println(mobile4.company);
		System.out.println(mobile4.type);
		
		mobile4.model = "��Ʈ10plus";
		System.out.println(mobile4.model);
		//�ʵ尪�� ������ �ƴ϶� ���Ҽ�����
		
		

	}

}
