package Car_0716;
import java.util.*;

public class ArrayList_Ex {

	public static void main(String[] args) {

		/*
		 * ArrayList, (Set, Map) �� ����.
		 * ArrayList: �ε���������, �ִ´�� Ŀ��, ����ִµ������� ������ ����
		 */
		
		// numbers��� �̸��� ArrayList
		
		//List<Ŭ�����̸�, �����ϰ����ϴµ�����>
		List<Integer> numbers = new ArrayList<Integer>();
		// <> : generic (<>�� ��ȣ��)
		//Ÿ�Ժ�ȯ�� ���� �ʰ� �ش� Ÿ���� ����Ҽ� �ְ� ����
		
		List<String> strs = new ArrayList<String>();
		//��̸���Ʈ�� ���� �ڽ��� ����Ű� �ű⿡ ����Ǵ°�
		
		//numbers�� �� ����, add�޼ҵ�, 10:�Ű�����(10�� ����Ʈ�� �����Ѵ�)
		//ArrayList �̸�.�޼ҵ��̸�(�ְ��� �ϴ� �Ű�����);
		numbers.add(10);
		
		int num = 100;
		numbers.add(num);
		System.out.println("����Ʈ "+numbers.add(500));
		numbers.add(1, 99);//numbers�� 1�� �ε����� 99��� ���� ����, �׷� ���� 1���ε����� �ִ� 
		//�� 100�� 2������ 2���� 3������ ��ġ���.�ڷ� �и�, �׷��� ũ�Ⱑ ��������
		numbers.add(1, 999);//�̷��� �� ������ �������� �߰��Ѱ� 1�� �ε����� ���� �� �������� �ڷ� �з���
		
		
		//��ü ������ ����, numbers�� �ִ� ���� ���� ������. �����δ� .���
		//numbers.clear();
		numbers.remove(2);//remove�� �ϳ��� ������ �����ϴ°�, �������� ���ڸ��� �ڿ��ִ°� ������, �������� ����
		
		//����Ʈ ���
		System.out.println(numbers.get(0));//10���
		System.out.println(numbers.get(1));//100���
		System.out.println(numbers.get(2));
		
		// ArrayList ũ�� ���, ����ִ� ������ ��ŭ�� ��̸���Ʈ�� ũ����
		System.out.println(numbers.size());
		
		//for���� �̿��Ͽ� ArrayList�� ��� ��� ������ ���
		
		System.out.println("for���� �̿��Ͽ� ArrayList�� ��� ��� ������ ���");
		for(int i=0; i<numbers.size(); i++) {
			System.out.println("�ε��� "+i+" : "+numbers.get(i));
		}
		
		List<String> str2 = new ArrayList<String>();

		str2.add("�������");
		
		strs.add("�����󰡰�����");//��Ʈ���� �������ͷ� ""�� ����
		strs.add("fffff");
		System.out.println(strs);
		System.out.println(strs.size());//strs�� ����� �˷��ִ°�
		System.out.println("1 "+strs);
		System.out.println(str2);
		
		List<StudentDTO2> stuList = new ArrayList<StudentDTO2>();
		StudentDTO2 stu = new StudentDTO2();
		stu.setName("ȸ��1");
		stu.setAddress("��õ������");
		stu.setPhone("010-1212-0022");
		stuList.add(stu);
		System.out.println("stuList.get(0) : "+stuList.get(0));
		System.out.println("getName ��� : "+stuList.get(0).getName());//�������� �ʵ尪 ���, ��Ȯ�� Ȯ���� ����
		
		StudentDTO2 stu1 = new StudentDTO2();
		stu1.setName("ȸ��2");
		stu1.setAddress("�����");
		stu1.setPhone("010-2455-5575");
		stuList.add(stu1);
		System.out.println(stuList.get(1).getName());
		
		for (int i=0; i<stuList.size(); i++) {
			System.out.println("��ü ��� : "+stuList.get(i));
			System.out.println("�̸��� ��� : "+stuList.get(i).getName());
			
			
			
		}
		
		//		System.out.println(numbers.get(index��ȣ));
	}
}
