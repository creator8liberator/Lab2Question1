package com.gllab2.paymoney;

public class PayMoney {
	
	public int numberOfDayTransactions (int[] transactions, int target) {
		for (int i=0; i<transactions.length; i++) {
			if (transactions[i] == target || target < transactions[i])
				return i + 1;
			else {
				target = target - transactions[i];
			}
		}
		return -1;
	}

}
