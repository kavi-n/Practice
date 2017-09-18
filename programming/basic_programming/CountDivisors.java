package basic_programming;

import java.util.Scanner;

public class CountDivisors {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int divisor = s.nextInt();
		int count = 0;
		if(start > end){
			int swap = start;
			start = end;
			end = swap;
		}
		while(start <= end){
			if(start%divisor == 0){
				count++;
			}
			start++;
		}
		System.out.println(count);
	}
}
