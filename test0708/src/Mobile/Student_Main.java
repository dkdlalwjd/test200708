package Mobile;

public class Student_Main {

	public static void main(String[] args) {
		// Student_Main ���θ޼ҵ�
		//�� ������ ���������� �����ϴ� �ʵ带 �����
		//������ ��ü�� ����, �������� �������� ������
		System.out.println("[������ ��������]");
		
		Student Student1 = new Student();
		Student1.name = "�����";
		Student1.gender = "����";
		Student1.age = 29;
		Student1.address = "��õ ���� ������";
		Student1.exp = false;
		System.out.println(Student1.name+ " : "+ Student1.gender+" / "+ Student1.age+" / "+ Student1.address+" / "+ Student1.exp);

		
		Student Student2 = new Student();
		Student2.name = "������";
		Student2.gender = "����";
		Student2.age = 24;
		Student2.address = "��õ �־ȵ�?";
		Student1.exp = false;
		System.out.println(Student2.name+ " : "+ Student2.gender+" / "+ Student2.age+" / "+ Student2.address+" / "+ Student2.exp);

		
		Student Student3 = new Student();
		Student3.name = "������";
		Student3.gender = "����";
		Student3.age = 23;
		Student3.address = "��õ ����";
		Student1.exp = false;
		System.out.println(Student3.name+ " : "+ Student3.gender+" / "+ Student3.age+" / "+ Student3.address+" / "+ Student3.exp);

		System.out.println(Student1.toString());

		
		//�Ű������� �ִ� ������
		//Student Student4 = new Student();
		Student Student5 = new Student("�ֿ���","����",21, "��õ ���õ�",false, "01022224444");	
		System.out.println("dd"+Student5.toString());
		
		
		
		
		
		
		
		
		
	}

}
