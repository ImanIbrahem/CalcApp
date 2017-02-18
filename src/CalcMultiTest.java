import static org.junit.Assert.*;

import org.junit.Test;

public class CalcMultiTest {

	@Test
	public void MultiTest ()
	{
		CalcModel test = new CalcModel ();
		double result = test.calculate(5, 3.6, 3);
		assertEquals(18,result,0.00001);
		

	}

}
