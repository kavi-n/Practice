package basic_programming;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(Factorial.fact(new Scanner(System.in).nextInt()));
	}
	
	public static int fact(int number){
		if(number == 1){
			return 1;
		}
		return number * fact(--number);
	}
	
}
