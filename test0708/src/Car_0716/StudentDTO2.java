package Car_0716;

public class StudentDTO2 {

	// ������ �Ʒû� ������ ���� �ʵ�� ��� �ʵ带 �Ű������� �ϴ� �����ڸ� ����
	// Ŭ���� 3�������

	private String name;// �̸�
	private String gender;// ����
	private String address;// �ּ�
	private String phone;// ����ȣ
	private int age; // ����
	private boolean exp;// ���α׷��� ���迩��
//public, private: ����������
	// private : �� ġ�� ���� Ŭ������ �����ִ�

	
	
	public void setName2(String name) {
		this.name = name;}
	public String getName2() {
		return name;}
	
	public void setGerder(String gender) {
		this.gender = gender;
	}
	public String getGerder() {
		return gender;
	}
	
	public void setAddress() {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setPhone() {
		this.phone = phone;}
		public String getPhone() {
			return phone;
		}
	
	public void setAge() {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setExp() {
		this.exp = exp;
	}
	public boolean getExp() {
		return exp; 
	}
	
	
	
	
	
	
	
	/*
	 * get, set �޼ҵ� DTO(Date Transfer Object): �����͸� ��Ƽ� �����ϱ� ���� Ŭ���� ������� : �ʵ忡 ����
	 * ������ �ƴ� �޼ҵ带 ���� �����Ͽ� �ʵ尪 ���� �� ���� get �޼ҵ� : �ܺο��� �ʵ尪�� ������ �Ҷ�(��������) set �޼ҵ� :
	 * �ܺο��� �ʵ尪�� �����Ҷ�(�ʵ尪 ���)
	 * 
	 */
	// nama�ʵ忡 ���� get, set �޼ҵ� ����

	public StudentDTO2(String name, String gender, String address, String phone, int age, boolean exp) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.age = age;
		this.exp = exp;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setExp(boolean exp) {
		this.exp = exp;
	}
	// setName -> ó�� �ҹ��� �ڿ� �빮��
	public void setName(String name) {
		this.name = name;
		// �Ű����� String name�̰� �ʵ忡 ����name
	}

	// get�� ������ ȣ���ѵ��� ���� �����, �׷��� ������ ����
	// Ÿ���� ���� �ʵ带 ���� Ÿ���� Ȯ��
	public String getName() {
		return name;
	}

	// �⺻������
	StudentDTO2() {

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", address=" + address + ", phone=" + phone + ", age="
				+ age + ", exp=" + exp + "]";
	}

	// ����ʵ带 �Ű������� �ϴ� �����ڸ� ����
//	public StudentDTO2(String name, String gender, String address, String phone, int age, boolean exp) {
//		super();
//		this.name = name;
//		this.gender = gender;
//		this.address = address;
//		this.phone = phone;
//		this.age = age;
//		this.exp = exp;
		
	

	
	public StudentDTO2(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;

		
		
		
	}
}
