package test0710;

import java.util.Arrays;

public class ex0710_3 {

	public static void main(String[] args) {
		// ������������ num = {3,2,1,5,4}ó���ΰ� ũ����ؼ� ���� ������ ���� ���ο�,���� ��ġ�ٲ� �����ʿ�
		//�������� {1,2,3,4,5}-> Bubble���� �̶����
		//���� �ΰ��� �ִ� �迭�� ��ġ�� �ٲ�����, �׸��� �߰�
		System.out.println("[�������� ����]");

		int [] num = {3,2,1,5,4};
		int [] num2 = {3,2,1,5,4};

		int temp = 0;//�ڸ��ٲ��Ҷ� �ӽ������
		
		/*
		 * 1ȸ���ݺ� : 0,1 0,2 0,3 0,4
		 * 2ȸ���ݺ� : 1,2 1,3 1,4
		 * 3ȸ���ݺ� : 2,3 2,4
		 * 4ȸ���ݺ� : 3,4
		 */
		
		
		System.out.println("������ : "+num[0]+" "+num[1]+" "+num[2]+" "+num[3]+" "+num[4]);
		
			for (int i=0; i<num.length; i++) {
				for(int j=i+1; j<num.length; j++) {
					if(num[i]>num[i]) {
						temp=num[j];
						num[i] = num[j];
						num[j] = temp;
					}
						}
					}
					for(int i=0; i<num.length; i++)	{
						System.out.print(num[i]);
				
				
				
				Arrays.Sort(num2);
				for
			}//for ��ȣ
			
			
			
				
		}//���θ޼ҵ� ��ȣ
	}//ū�޼ҵ� ��ȣ


