package zoho;

import java.util.Scanner;

public class OddLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//read the input
		System.out.println("Enter String - ");
		String str=sc.next(); 
		
		//split the string and make some rearrangement
		String reStr=str.substring(str.length()/2)+str.substring(0,str.length()/2);
		
		for(int i=0;i<reStr.length();i++) {
			int k=0;
			for(int j=0;j<reStr.length();j++) {
				if(j>=reStr.length()-i-1)
					System.out.print(reStr.charAt(k++));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

