package basic_programming;

import java.util.Scanner;

public class ProfilePic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int maxSize = s.nextInt();
		StringBuffer output = new StringBuffer();
		for(int i=s.nextInt();i>0;i--){
			int width = s.nextInt();
			int height = s.nextInt();
			if(width < maxSize || height < maxSize){
				output.append("UPLOAD ANOTHER").append("\n");
			}else if((width == maxSize && height == maxSize) ||  (width == height)){
				output.append("ACCEPTED").append("\n");
			}else{
				output.append("CROP IT").append("\n");
			}
		}
		System.out.println(output);
	}
	
}
