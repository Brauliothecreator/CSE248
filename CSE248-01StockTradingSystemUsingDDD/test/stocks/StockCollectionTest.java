package stocks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StockCollectionTest {
	static StockBag stockBag;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		stockBag = new StockBag(10);
		stockBag.insert();
		stockBag.insert();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		double actual = 0.0;
		
		assertEquals(65000, actual);
		
	}
	


}
