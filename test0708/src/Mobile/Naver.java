package Mobile;

public class Naver {
//���θ޼ҵ� X
	String id;//���̵�
	String password;//��й�ȣ
	String passwordRe;//��й�ȣ ��Ȯ��
	String name;//�̸�
	String DateBirth;//�������
	String gender; //����
	String MyConfEmail; //���� Ȯ�� �̸���
	String phone;//�޴���
	
	//�޼ҵ� (method)
	//Override �� ��ӿ��� �޼ҵ带 �������ϴ� ��
	@Override//������̼�(Annotation)
	public String toString() {
		//������ �����ϴ� �޼ҵ���
		return "Naver [id=" + id + ", password=" + password + ", passwordRe=" + passwordRe + ", name=" + name
				+ ", DateBirth=" + DateBirth + ", gender=" + gender + ", MyConfEmail=" + MyConfEmail + ", phone="
				+ phone + "]";
	}


	public Naver(String id, String password, String passwordRe, String name, String dateBirth, String gender,
			String myConfEmail, String phone) {
		System.out.println("�Ű����� �ִ� ������ ȣ��");
		//super();
		this.id = id;
		this.password = password;
		this.passwordRe = passwordRe;
		this.name = name;
		DateBirth = dateBirth;
		this.gender = gender;
		MyConfEmail = myConfEmail;
		this.phone = phone;
	}

	
	//�⺻������, ���ο��� ���ٰ� �Ѱ�->��ü����� �̹��� ����.
	Naver(){
		System.out.println("�⺻������ ȣ��");
	}
}
