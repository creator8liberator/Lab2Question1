package com.gllab2.paymoney;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number number of days for computation (size of transaction arrray) :");
		int size = sc.nextInt();
		int[] transactions = new int[size];
		for (int i = 0; i< size; i++) {
			System.out.println("Enter transaction amount (in crores of rupees) of Day "+ (i + 1) + " :");
			transactions[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("You entered :");
		displayTransactions(transactions);

		System.out.println();
		System.out.println("Now, enter the target amount (in crores of rupees) :");
		int target = sc.nextInt();
		
		System.out.println();
		PayMoney pm = new PayMoney();
		int numberOfDays = pm.numberOfDayTransactions(transactions, target);
		if (numberOfDays == -1)
			System.out.println("The Target " + target + " is not achieved!");
		else {
			System.out.println("The Target " + target + " is achieved in " + numberOfDays + " days!");
		}
				
				
		sc.close();
		
	}
	
	
	
	public static void displayTransactions(int[] transactions) {
		for (int transaction : transactions) {
			System.out.print(transaction + " ");
		}
		System.out.println();
	}

}
