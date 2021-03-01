package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LatTest {

	@Test
	void test1() {
		int[] stockPrices = {10,7,5,8,11,9};
		LatClass t = new LatClass();
		int out = t.getMaxProfit(stockPrices);
		assertEquals(6,out);
	}
	
	@Test
	void test2() {
		int[] stockPrices = {47, 46,45,46, 48, 56, 57, 62, 57, 63, 49, 48, 46, 500};
		LatClass t = new LatClass();
		int out = t.getMaxProfit(stockPrices);
		assertEquals(455,out);
	}
	
	@Test
	void test3() {
		int[] stockPrices = {50,1,2,4,5,8,9,5,3,2};
		LatClass t = new LatClass();
		int out = t.getMaxProfit(stockPrices);
		assertEquals(0,out);
	}

}
