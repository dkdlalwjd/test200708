package Car_0716;

public class Student {

	//������ �Ʒû� ������ ���� �ʵ�� ��� �ʵ带 �Ű������� �ϴ� �����ڸ� ����
	//Ŭ���� 3�������
	
	 String name;//�̸�
	 String gender;//����
	 String address;//�ּ�
	 String phone;//����ȣ
	 int age; //����
	 boolean exp;//���α׷��� ���迩��
//public, private: ����������
	//private : �� ġ�� ���� Ŭ������ �����ִ� 
	
	/*
	 * get, set �޼ҵ�
	 * DTO(Date Transfer Object): �����͸� ��Ƽ� �����ϱ� ���� Ŭ����
	 * ������� : �ʵ忡 ���� ������ �ƴ� �޼ҵ带 ���� �����Ͽ� �ʵ尪 ���� �� ����
	 * get �޼ҵ� : �ܺο��� �ʵ尪�� ������ �Ҷ�(��������)
	 * set �޼ҵ� : �ܺο��� �ʵ尪�� �����Ҷ�(�ʵ尪 ���)
	 * 
	 */
	//nama�ʵ忡 ���� get, set �޼ҵ� ����
	
	//setName -> ó�� �ҹ��� �ڿ� �빮��
	public void setName(String name) {
		this.name = name;
		//�Ű����� String name�̰� �ʵ忡 ����name
	}
	
	//get�� ������ ȣ���ѵ��� ���� �����, �׷��� ������ ����
	//Ÿ���� ���� �ʵ带 ���� Ÿ���� Ȯ��
	public String getName() {
		return name;
	}
	
	
	
	
	//�⺻������
	Student(){
		 
	 }
	


	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", address=" + address + ", phone=" + phone + ", age="
				+ age + ", exp=" + exp + "]";
	}



	//����ʵ带 �Ű������� �ϴ� �����ڸ� ����
	public Student(String name, String gender, String address, String phone, int age, boolean exp) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.age = age;
		this.exp = exp;
	}

	public Student(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	
	
	
	
	
	
}
