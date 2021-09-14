package primeNumApp;

import java.util.Scanner;

public class PrimeNumberService {
	
	//below finds Prime Numbers
	
	public String findPrime(String userNumber) {
		
		int beginNumber =0;
		int num =0;
		String primeNumbers = "";
	
		int inputNumber=Integer.parseInt(userNumber);  
		
		for (beginNumber = 1; beginNumber <= inputNumber; beginNumber++)
		{
		int counter=0;
			for(num =beginNumber; num>=1; num--) 	{
			  if(beginNumber%num==0) 	{
			   counter = counter + 1;
			   }
			}
		
		  if (counter ==2){
		   primeNumbers = primeNumbers + " "+ beginNumber + " ";
		   }
		
		}
		
		System.out.println("Prime numbers between 1 and n are:");
		System.out.println(primeNumbers);
		
		return primeNumbers;
		}
	
	//&&&&&
	/*
	 * public String findPrime(int inputNumber) {
	 * 
	 * 
	 * 
	 * Scanner scanner = new Scanner(System.in); int beginNumber =0; int num =0;
	 * String primeNumbers = ""; System.out.println("Enter a number:"); int
	 * inputNumber = scanner.nextInt(); scanner.close(); for (beginNumber = 1;
	 * beginNumber <= inputNumber; beginNumber++) { int counter=0; for(num
	 * =beginNumber; num>=1; num--) { if(beginNumber%num==0) { counter = counter +
	 * 1; } }
	 * 
	 * if (counter ==2){ primeNumbers = primeNumbers + " "+ beginNumber + " "; }
	 * 
	 * }
	 * 
	 * System.out.println("Prime numbers between 1 and n are:");
	 * System.out.println(primeNumbers); }
	 */
	
	
	}


