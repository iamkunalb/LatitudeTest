package main;

import java.util.List;

public class LatClass {
	public int getMaxProfit(int[] stockPrices) {
		int maxIndex = 0;
		int minIndex = 0;
		
		//get the index of the MAX stock price
		for (int i = 0; i < stockPrices.length; i++) {
			if (stockPrices[i] > stockPrices[maxIndex]) {
				maxIndex = i;
			}
		}
		
		//get all prices before max value as BUY has to be before SELL
		//and get the index of the MIN stock price
		for (int i = 0; i < maxIndex; i++) {
			if (stockPrices[i] < stockPrices[minIndex]) {
				minIndex = i;
			}
		}
		
		//return value of MAX PROFIT by finding diff between highest and lowest stock price
		return stockPrices[maxIndex] - stockPrices[minIndex];
	}
}
