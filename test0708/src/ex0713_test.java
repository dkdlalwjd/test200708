import java.util.Scanner;

public class ex0713_test {

	public static void main(String[] args) {
		// �ܵ��Ž����ֱ�, ����ū������ �����ϸ鼭 ��������, ������»�Ȳ
				//�迭 Ȱ��, �Ž����� ���ϱ� ����
				//������ ������ ��, ��� ������, ���� �Է¹����� 500�� ������ �����ŷ� 100�� ������ 50�������� 10�� ������
				
				
				System.out.println("[ �ܵ� ��� ���α׷� ]");
				int input = 0;//��ĳ�� �Է°�
				Scanner scan = new Scanner(System.in);
				System.out.print("�ݾ� �Է� : ");
				input = scan.nextInt();
				
				int [] change = {500, 100, 50, 10};//4������ �ݺ��Ұ�
				int coinCount = 0;//�������� ��¿� ����
				for(int j=0; j<change.length; j++) {
					coinCount = input/change[j];
					System.out.println(change[j]+"�� ���� : "+coinCount+"��");
					input = input % change[j];
				}
				
				
				
				
				
			
				int sum = 0;//�ܱ�
				int fiveH =0;//500��, coin500 �� ����
				int oneH = 0;//100��
				int fifty = 0;//50��
				int ten = 0;//10��
				

				for (int i = 0; i<1; i++) {
				
				sum = input /500;//500�� �ʿ� ����
					System.out.println("500�� ���� : "+sum+"��");
					fiveH = input%500;//500���� ���� �ʿ��Ѹ�ŭ �����ϰ� ���� ��

					oneH=fiveH/100;//500���� �򿡼� �ʿ��� ��� ����
					System.out.println("100�� ���� : "+oneH+"��");
					oneH=fiveH%100;//100���� �ʿ��Ѹ�ŭ �����ϰ� ���� ��
					
					fifty=oneH/50;
					System.out.println("50�� ���� : "+fifty+"��");
					fifty=oneH%50;//50���� �ʿ��Ѹ�ŭ �����ϰ� ������
					
					ten = fifty/10;
					System.out.println("10�� ���� : "+ten+"��");
					ten = fifty%10;//10���� �ʿ��Ѹ�ŭ �����ϰ� ������
					
				}
								
					}//��ȣ
			}//��ȣ
