package test0710;

import java.util.Arrays;

public class ex0710_b {

	public static void main(String[] args) {
		// 
		
		int arr[] = {4,5,11,85,15,1,88,45};
		System.out.println("������ : ");
		
		for(int i=0; i<arr.length; i++) {
			
		}
		
		
		
		Arrays.parallelSort(arr);
		
		for(int i : arr) {
			System.out.print("������ : "+i+", ");
		}

	}

}
