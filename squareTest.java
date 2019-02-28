
import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void testSquare() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assertEquals(25, output);
	}
	@Test
	   public void test() {
	      assertTrue(true);
	   }
}
