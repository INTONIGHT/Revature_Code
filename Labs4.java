package com.revature.day3;

public class Labs4 {
	public int fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	public static int factorial(int num) {
		if(num < 0) {
			//best practice is to throw an error.
			System.out.println("please chose a different number 0 or greater");
		}
		if(num == 0 || num == 1) {
			return 1;
		}
		return num * factorial(num-1);
	}
	public static int findLetter(char target, char[] data) {
		int result = -1;
		if(data == null) {
			return -1;
		}
		for(int i =0; i < data.length; i++) {
			char temp = data[i];
			if(temp == target) {
				return i;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Labs4 fib = new Labs4();
		int result = fib.fibonacci(10);
		//this is asking what fibonacci number is at position n
		//i was tired and put 5 and kept getting 5 and thinking it 
		//was wrong.
		System.out.println(result);
		System.out.println(factorial(4));
		char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 
				'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 
				'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 
				'z' };
		System.out.println(findLetter('m',letters));
		
	}

}
public class Labs4 {
    
}
