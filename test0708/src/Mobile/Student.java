package Mobile;

public class Student {

	String name;//�̸�
	String gender;//����
	int age;//����
	String address;//�ּ�
	boolean exp;//���α׷��� ���迩��
	String phone;//����ȣ->��Ʈ������ ���°� ���� 010000 / 010-541 �ΰ���Ÿ������
		
	//��� �ʵ带 �Ű������� �ϴ� ������
	
//	String(String name, String gender, int age,String address,boolean exp ,String phone)

	Student(){
		
	}//�⺻��������
	
	
@Override
//�޼ҵ带 �����, �ʵ尪�� ������ִ� �޼ҵ�
	public String toString() {
		return "[name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address + ", exp=" + exp
				+ ", phone=" + phone + "]";
	}

	//��Ŭ��=
	public Student(String name, String gender, int age, String address, boolean exp, String phone) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.exp = exp;
		this.phone = phone;
		
		
		
		
	}}
	
	
	
	
	
	
	

