package Car_0716;

public class Car {

	int gas;//������ �ʵ� gas����
	//����X, setGas: �޼ҵ�, �Ű�����:������ gas����
	
	//�����ڼ���
	Car(int gas){
		this.gas = gas;
	}
	
	void setGas(int gas) {
		this.gas = gas;//gas�� gas ��� ����Ҽ��ְ� ����
//���޹������� �ʵ忡 ����
	}
	//boolŸ�� isLeftGas������ ����
	boolean isLeftGas() {
		//���� ������ 0�̶�� "gas�� �����ϴ�."���, ��µǸ� �ݺ� ���߱�
		if (gas ==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		} else {
			//�׿ܿ��� �� "gas�� �ֽ��ϴ�."�� ������ ����
			System.out.println("gas�� �ֽ��ϴ�.");
			return true;
		}
	}
	//���Ͼ���, runȣ��
	void run() {
		boolean run = true;
		//run�� ������ ����, true��

		//while�� ������ �ݺ�����
		while (run) {
			//���� ������ 0���� ũ�� ����Ʈ�� ����ϰ�, -1�ϱ�
			if (gas>0) {
				System.out.println("�޸��ϴ�.(gas �ܷ� : "+gas+")");
				gas -=1;
				
				//������ 0���� ũ�� ������ ����ϴ� ����ϰ� �ݺ� ����
			} else {
				System.out.println("����ϴ�.(gas �ܷ� : "+gas+")");
				run = false;
				//if else ���°�� ������ �ʿ�!
			}			
		}
	}
}
