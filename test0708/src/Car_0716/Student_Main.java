package Car_0716;

import java.util.Scanner;

public class Student_Main {

	public static void main(String[] args) {
		// ����Ŭ����
		
		//StudentDTO2 Ÿ���� ���� stu1����
		StudentDTO2 stu1 = null;
		//stu1.name = "ȸ��1";
		// set �޼ҵ带 �̿��Ͽ� name �ʵ忡 �� ����
	//	stu1.setName("ȸ��1");
	//	System.out.println(stu1.name);
		// get �޼ҵ带 �̿��Ͽ� name �ʵ忡 �� ���
		//System.out.println(stu1.getName());

		//��� �ʵ忡 ���� �� �� ����
		
		
		
		int num = 0;
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		String name = "";
		String address = "";
		String phone = "";
		String [] num2 = new String[name.length()];

		
		//StudentDTO Ŭ������ stu�� �����ϰ�, ���� �����.
		Student stu = null;
		Application app = new Application();//2.�⼮üũ
		Application check = new Application();//3.������Ȯ��
		
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.�űԵ�� | 2.�⼮üũ | 3.������Ȯ�� | 4.�������� | 5.���� |6.DTO Ŭ������ �̿��� ��ü����");
			System.out.println("-------------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scan.nextInt();
			
					
					
			switch(selectNo) {
			case 1:
				System.out.print("�̸� : ");
				name = scan.next();
				System.out.print("�ּ� : ");
				address = scan.next();
				System.out.print("��ȭ��ȣ : ");
				phone = scan.next();
				
				stu = new Student(name, address, phone);
				break;
				
			case 2:
				app.enter(stu);//�⼮üũ�ϴ� ����
				
				break;
				
			case 3://������Ȯ��, ��ü�� ����� �ʵ尪 ���
				//for(int i = 0; i<num2.length; i++) {
					
					app.view(stu);
					
					System.out.println("�̸� : "+stu.name);
					System.out.println("�ּ� : "+stu.address);
					System.out.println("��ȭ��ȣ : "+stu.phone);
				//}
				
				break;
				
			case 4://��������
				//�ּҸ� ����Ư���÷� �ٲٰ� ��� �ʵ尪 ���
				//if (stu.address.equals("��õ������"))
				//	System.out.println("�̸� : "+stu.name);
					//System.out.println("�ּ� : ����Ư����");
					//System.out.println("��ȭ��ȣ : "+stu.phone);

					app.change(stu);
				break;
				
			case 6:
					//DTO
				stu1 = new StudentDTO2();
				System.out.print("�̸� : ");
				name = scan.next();
				System.out.print("�ּ� : ");
				address = scan.next();
				System.out.print("��ȭ��ȣ : ");
				phone = scan.next();
				
				// stu1�� StudentDTO2Ŭ������ ��ü�� ����
				stu1 = new StudentDTO2();
				stu1.setName(name);
				stu1.setAddress(address);
				stu1.setPhone(phone);
				
				break;
			
			}
					
			
			
		}//while��
				
		
		
	}

}
