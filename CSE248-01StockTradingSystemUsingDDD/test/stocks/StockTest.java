package stocks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StockTest {

	@Test
	void test() {
		double actual =0;
		double actual2 = 0;
		Stock stock1 = new Stock("IBM", 1000.00, 25 );
		actual = stock1.getTotal();
		Stock stock2 = new Stock("GE", 400.00, 100);
		actual2 = stock2.getTotal();
		assertEquals(25000, actual);
		assertEquals(40000, actual2);
		
		
	}
	

}
