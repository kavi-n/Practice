package basic_programming;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int primeLimit = s.nextInt();
		StringBuffer output = new StringBuffer();
		for(int n=2;n<=primeLimit;n++){
			int divisor = 2;
			while(divisor <= primeLimit){
			if(n%divisor == 0){
				if(divisor == n){
					output.append(n+" ");
					break;
				}else{
					break;
				}
			}
			divisor++;
		}
		}
		System.out.println(output);
	}
}
