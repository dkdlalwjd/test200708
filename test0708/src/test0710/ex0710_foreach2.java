package test0710;

public class ex0710_foreach2 {

	public static void main(String[] args) {
		// ���� 5�� �ִ�  String �迭�� �����ϰ�
		// foreach�� �̿��Ͽ� �迭�� ����� ���� ��� ����϶�
		
		System.out.println("[String���� �� foreach�� ����ϱ�]");
		String animal[] = {"�����", "������", "ȣ����" ,"�䳢","��"};//
		
		//�ݺ��ؼ� �����ϰ��� �ϴ� ����� ����
		for(String a:animal) {
			System.out.print(a+",");
			
			//���������߿� �Է��� �ް� �� ���ڰ� ���° ��ġ���� ����ϱ�
		}
		
		
	}
}
