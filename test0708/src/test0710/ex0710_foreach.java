package test0710;

public class ex0710_foreach {

	public static void main(String[] args) {
		// advanced for(����  for)
		// foreach
		int[] num = {1,2,3,4,5};
		
		//num[]�� ����Ҷ� ���1
		for(int i=0; i<num.length; i++) {
			System.out.println(" "+num[i]);
			
		}
		//foreach ���2
		for(int a:num) {
			System.out.print(" "+a);
		}
		
		
	}

}
