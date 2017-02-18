import static org.junit.Assert.*;

import org.junit.Test;

public class CalcDivTest {

	@Test
	public void testDiv ()
	{
		CalcModel test = new CalcModel ();
		double result = test.calculate(4.2, 2, 2);
		assertEquals(2.1,result,0.00001);

	}

}
