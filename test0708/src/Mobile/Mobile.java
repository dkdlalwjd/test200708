package Mobile;

public class Mobile {
	
	
	String company = "�Ｚ";
	String model;
	String color;
	int type;//4g, 5g
	 
	// ��� �ʵ带 �Ű������� �ϴ� ������
	//�������� �̸��� Ŭ������ �̸��� �Ȱ��ƾ� �Ѵ�.
	
	//�⺻������ �����,
	//��� �ʵ带 �Ű������� �ϴ� ������
	//�Ű�����: �����ϴ� ����/����� ���� /this. �� ������ �ʵ���
	Mobile(String company, String model, String color, int type) {
		
		//���޹��� �Ű������� ��� ���� ���� �ʵ忡 ����
		this.company = company;//this�� ������ �ʵ忡�� ����°�
		this.model = model;
		this.color = color;
		this.type = type;
		//Ŭ������ �⺻�����ڸ� �����ϸ� �⺻�����ڴ� ���⼭�� ������ �ȵǰ� ��������
		
		
	}
	Mobile (String model, String color, int type){
	this.model = model;
	this.color = color;
	this.type = type;
	//���۴� �Ｚ�� �״�� �ΰ� �����ϰ� ������
	}

	//�Ű��������� �⺻������ ����, �����ڸ� ������ �ټ�����
	Mobile(){
		
	}
	

	//������ overloading : �����ڸ� ������ �����Ҽ� ����
	//�����ε��̶� �������̵� ������ �˱�-������ ���������
	
	

}
