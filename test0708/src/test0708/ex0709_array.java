package test0708;

public class ex0709_array {

	public static void main(String[] args) {
		// ũ�Ⱑ 5�� ������ �迭�� �����Ͽ� ���� �˾Ƽ� �Է��ϰ�
		// �Էµ� ������ ���հ� ����� ���Ͻÿ�.
		//�迭���� ��ĳ�ʷ� ���� �ϳ��ϳ� �Է�
		
		int [] num = new int[5];
	
		int[] num2 = {2,2,3,4,5};
		
		int sum = 0;//�հ�
		int avg = 0;//���
		//�ݺ����� �̿��Ͽ� �迭�� ����
		for (int j=0; j<num.length; j++) {
		//	sum = sum+1;
		//	sum = sum+2;
		//	sum = sum+3;
		//	sum = sum+4;
		//	sum = sum+5;
			sum = sum +num2[j];

		}
	System.out.println(sum);
	avg= sum/num2.length;//���
	System.out.println(avg);
		
		
		

	}

}
