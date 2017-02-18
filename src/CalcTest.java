import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void testAdd ()
	{
		CalcModel test = new CalcModel ();
		double result = test.calculate(5.3, 3.5, 0);
		assertEquals(8.8,result,0.00001);
		
	}

}
