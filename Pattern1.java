package report;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);// create a obj scanner
		System.out.println("Enter no of rows: ");// getting number of rows as input
		int n= scanner.nextInt();
		int count=1;
		
		for(int i=1;i<=n;i++) { // i represents the throws
			for(int j=1;j<=i;j++) { // j represent the number of int in the row
	
				System.out.print(count + "  ");
				count++;
			}
			System.out.println();
				
	
			
			
		}

	}

}
