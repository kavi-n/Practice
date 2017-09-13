package basic_programming;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inputString = s.next();
		char[] charArray = inputString.toCharArray();
		StringBuffer str = new StringBuffer();
		for(int i=charArray.length-1;i>=0;i--){
			str.append(charArray[i]);
		}
		if(inputString.equals(str.toString())){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
	}
	
}
