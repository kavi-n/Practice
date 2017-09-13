package basic_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> aa = new ArrayList<Integer>();
		for(int i=n;i>0;i--){
			char[] acharArray = scanner.next().toCharArray();
			char[] bcharArray = scanner.next().toCharArray();
			Arrays.sort(acharArray);
			Arrays.sort(bcharArray);
			int a = acharArray.length-1;
			int b = bcharArray.length-1;
			int remove = 0;
			while(a>-1){
				if(b==-1){
					remove++;
					a--;
				}
				while(b>-1){
					if(a==-1){
						remove++;
						b--;
					}
					if(acharArray[a] == bcharArray[b]){
						a--;
						b--;
						break;
					}
					else if(acharArray[a] > bcharArray[b]){
						b--;
						remove++;
						break;
					}else if(acharArray[a] < bcharArray[b]){
						a--;
						remove++;
						break;
					}
				}
			}
			aa.add(remove);
		}
		for(Integer a : aa){
			System.out.println(a);
		}
	}
	
}
	