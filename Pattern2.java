package report;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number of rows :");
		int n=scanner.nextInt();// int n used to get the no.of lines of the patern
		
		for(int i=0;i<n;i++) // Determines wheather to print"*" or ' '.
			for(int j=0;j<n;j++) {
				if (j==i|| j==n-i-1) {
					System.out.print(" * ");
				}else {
					System.out.print(" ");
				}
			
		
			
		}
		System.out.println();
		
	
	}

}
