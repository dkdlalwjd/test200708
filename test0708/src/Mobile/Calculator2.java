package Mobile;

public class Calculator2 {

	//������ ���� add�� �����Ұǵ� ������ ���� x, y�� �Ű�������.
	//x+y�� ������ result��. result=x+y�ΰ�
	
	//add�޼ҵ�, ����Ÿ��: int, �Ű����� :����x,y
	int add(int x, int y) {
		int result = x+y;
		return result;
		//����(ȣ��)�߰� �װ�  result��
	}
	//�Ҽ��� avg�� ����, �Ű����� �װ� �������� x, y��
	double avg (int x, int y) {
		double sum = add(x, y);
		//�Ҽ��� sum�� x+y(x,y)��
		double result = sum/2;
		return result;//result�� ��� 17�� �����ϴ°�->ȣ���� ��ġ��
		//���⼭ result�� ���������� �ߺ������� �����غ��̴°�
	}
	
	void execute () {
		double result = avg(7,10);
		System.out.println("������:"+result);
		//execute�� ���Ͼ��� �Ű����� ������/�żҵ� ���ͼ��� �������ʺ��� ���� ȣ��Ǹ� �ٽðű� ����
	}
	
}
