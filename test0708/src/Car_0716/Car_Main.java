package Car_0716;

public class Car_Main {

	public static void main(String[] args) {
		// ����Ŭ����
		
		Car car =  new Car(5);//ī Ŭ�������� �Ű����� car����, 
		System.out.println("������ �������ּ��� : ");
		//car.setGas(gas);
		car.setGas(5);//car�ε� setGas �ε� �Ű��� 5ȣ��, ���� �ʵ忡 5��� �� ����
		boolean gasState = car.isLeftGas();//bool �Ű����� gasState�� isLeftGas����
		System.out.println(car.gas);//����5���
		if(gasState) {
			//����  gasSt�� ��� ���
			System.out.println("���");
			car.run();
		}
	}
}
