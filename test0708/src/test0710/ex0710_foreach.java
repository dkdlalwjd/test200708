package test0710;

public class ex0710_foreach {

	public static void main(String[] args) {
		// advanced for(향상된  for)
		// foreach
		int[] num = {1,2,3,4,5};
		
		//num[]을 출력할때 방법1
		for(int i=0; i<num.length; i++) {
			System.out.println(" "+num[i]);
			
		}
		//foreach 방법2
		for(int a:num) {
			System.out.print(" "+a);
		}
		
		
	}

}
