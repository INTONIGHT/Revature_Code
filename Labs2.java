package com.revature.primitives;

public class Labs2 {
	public void talk() {
		System.out.println("hello");
	}
	public void talk(String str) {
		System.out.println(str);
	}
	public double convert(int num) {
		return (double)num;
	}
	public static void main(String[] args) {
		//class instantation
		Labs2 l2 = new Labs2();
		l2.talk();
		l2.talk("Second print method");
		l2.convert(25);
		int [] intArray = new int[3];
		intArray[0] = -5123;
		intArray[1] =32;
		System.out.println(intArray);
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		boolean on = true;
		while(on) {
			System.out.println("inside the while loop");
			on = false;
		}
		do {
			System.out.println("inside the do");
		} while(on);
		for(int i =0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		/**
		 * Multi demensional arrays
		 */
		int[][][] my3dArray = new int[3][3][3];
		my3dArray[0][0][0] =1;
		int[] arr1 = {1,4,5,8,10,12,14,16,18,20};
		int[] arr2 = {1,2,3,5,7,9,11,13,17,19};
		for(int i = 0;i < arr1.length; i++) {
			for(int j =0; j < arr2.length; j++ ) {
				System.out.println(arr1[i] * arr2[j]);
			}
		}
	}

}
