package Mobile;

public class Calculator_Main {

	public static void main(String[] args) {
		//���� Ŭ���� Calculator:����(���ϱ�, ����, ������ �޼ҵ�)
		//Calculator Ŭ���� ��ü ����
		Calculator cal = new Calculator();
		
		
		cal.sum(8, 77);//void���
		int val1 = 10;
		int vai2 = 7;
		cal.sum(val1, vai2);//�żҵ带 ȣ���ϰ� �� Ÿ���� �¾ƾ���, int int / double double
		
		Calculator cal2 = new Calculator();
		cal.sum(3344, 3332);

		cal.sum1(5, 3);//����
		System.out.println(cal.sum1(8, 12));
	//	System.out.println(20);
		int result1 = cal.sum1(7, 10);
		System.out.println(result1);
		//= ������, ������ �캯���� ���� ����� �º��� ����ִ´�.
		
	}

}
