package test0710;

public class ex0710_bb {

	public static void main(String[] args) {
		int[] num3;
		//선언하면서 값을 지정하지 않는 배열
		num3 = new int[3];
		int[] num4 = new int[3];//크기3
		System.out.println(num4.length);//인덱스4
		
		for(int c=0; c<num4.length; c++) {
			System.out.println(num4[c]);
		}
		
		num3[0]=1;

	
	

	}

}
