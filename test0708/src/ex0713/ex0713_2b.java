package ex0713;

public class ex0713_2b {

	public static void main(String[] args) {
		// 2�� 3�� ������ �迭-> �� ù���� 3��, ��°�� 2�� �� ������ 6�� �������������
		//Ȱ�뵵�� ������ ������ �˰��־����, �迭�� ��� ���� ���ʳ���
		
		int[][] num = new int[2][3];
		System.out.println(num.length);//2���� �迭������ �迭.���� �ϸ� �ప ����
		System.out.println(num[0].length);//�ٺ��� ������, �ټ��� ������ 0��, �ε�����ȣ 0
		System.out.println(num[1].length);
		
		//3�� 3��
		int[][] num2 = new int[3][3];
		System.out.println(num2.length);
		
		//for���� �̿��Ͽ� num2�� ��� ��� �� ���
		for(int i =0; i<num2.length; i++) {
			for(int j=0; j<num2[i].length; j++)
			System.out.print(" num2�� : "+ num2[i][j]);
		}
		
		String[][] str = {{"��","��","��"},{"��","��","��"},{"��","��","��"}};
		//for(int c=0; c<str.length; c++) {
			//System.out.println(str[c]);
		//}
		

		//1�࿡ 1,2,3, 2�࿡ 4,5,6�� ����
		//int [][]num3 = {{1,2,3},{4,5,6}};//������ �߰�ȣ�� ���� , ���
		
		
		}

	}


