package basic_programming;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int inputArray = s.nextInt();
		int[] inputList = new int[inputArray];
		for(int i=0;i<inputArray;i++){
			inputList[i] = s.nextInt();
		}
		System.out.println(Product.callProduct(1,inputList,inputList[0]));
	}
	
	private static long callProduct(int start,int[] inputList,long out){
		long inout = (inputList[start] * out) % 1000000007;
		if(inputList.length == start+1){
			return inout;
		}
		return callProduct(++start, inputList, inout);
	}
	
}
