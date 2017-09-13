package basic_programming;

import java.util.Scanner;

public class PrintAscii {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String in = s.next();
		System.out.println((int)in.charAt(0));
	}
}
