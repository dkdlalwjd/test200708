package test0710;

public class ex0710 {

	public static void main(String[] args) {
		//�ִ밪 ã��

		int[] num= {5,10,3,7,2};//���� �ָ鼭 �迭����
//		num[0] = 5;
//		num[1] = 10;
//		num[2] = 3;
//		num[3] = 7;
//		num[4] = 2;
		
		int max = num[0];//max��� ���� ����, num�� 0��° �ε����� ����. 
		System.out.println("max: "+max);//max��� ������ num�� 0���̴�. �׷��� 5
		
		//for �ݺ��� ����, ������ ���� i ����(�ʱⰪ0), i<num���� ��ŭ=5����, i�� 1�� ����
		for(int i=0; i<num.length; i++) {
			if(max<num[i]) {
				//���� max�� num���� ������, max�� num[i]�̴�.
				//0��° : 5<0 ->�����ȵ�, �ƽ��� �״�� 5
				//1��° : 5<10 -> ����, �ƽ��� 10���� �ٲ�
				//2��° : 10<3 -> �����ȵ�, �ƽ��� 10
				//3��° : 10<7 -> �����ȵ�, �ƽ��� 10
				//4��° : 10>2 -> �����ȵ�, �ƽ��� 10
				max=num[i];
				//�׷��� �ƽ��� 10
			}
		}
		System.out.println("�ִ밪 : "+max);
		
		
			
		}
				
		

		
		
		
		

	}


