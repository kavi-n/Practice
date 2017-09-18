package basic_programming;

import java.util.Scanner;

public class UpperLowerCase {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		char[] inputArray = s.next().toCharArray();
		StringBuffer output = new StringBuffer();
		for(Character c : inputArray){
			if(c>=97&&c<=122){
				output.append((char)(c - 32));
			}else{
				output.append((char)(c + 32));
			}
		}
		System.out.println(output);
	}
	
}
