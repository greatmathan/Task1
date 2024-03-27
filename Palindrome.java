package report;

import java.util.Iterator;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);//Creating a scanner object
		System.out.println("Entering a String");//getting input from scanner
		String mat=scanner.nextLine();//
		String reversemat="";
		
	for(int i=mat.length()-1;i>=0;i--) {
		reversemat=reversemat+mat.charAt(i);// Adding the last charbefore the first char to get the reversed string
		}
	if(mat.equalsIgnoreCase(reversemat)) {
		System.out.println(mat+"is a palindrome. ");//to check if the reversed  string  is equal to the given string ignoring capital letters
		
	} else {
		System.out.println(mat+"is not a palindrome.");
	}
	 
	
	}
		
	}
	


