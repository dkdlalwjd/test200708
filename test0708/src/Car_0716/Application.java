package Car_0716;

import java.util.Date;

public class Application {

	public void enter(Student stu) {

		// �ι�° Ŭ����

		System.out.println("Application Ŭ������ enter �޼ҵ�");
		System.out.println(stu.name + " �� �ԽǿϷ� ");
		// ��ü�� stu�ε�, name������ ���
		System.out.println("�Խǽð� : " + new Date());

	}

	public void view(Student stu) {
		System.out.println("����Ȯ�� �޴� ����");
		System.out.println(stu.toString());
	}

	public void change(Student stu) {
		System.out.println("��������");
		stu.address="����Ư����";
//		System.out.println("�̸� : "+stu.name);
//		System.out.println("�ּ� : "+stu.address);
//		System.out.println("��ȭ��ȣ : "+stu.phone);
		System.out.println(stu.toString());
	}

}
