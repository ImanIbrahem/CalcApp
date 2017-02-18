import static org.junit.Assert.*;

import org.junit.Test;

public class CalcSubTest {

	@Test
	public void testSub ()
	{
		CalcModel test = new CalcModel ();
		double result = test.calculate(5, 8, 1);
		assertEquals(-3,result,0.00001);
		
	}
}