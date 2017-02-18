
public class CalcModel {
	public double result;

		public double calculate (double fn ,double sc ,int opr)
		{
			if (opr==0)
				result=fn+sc;
			else if (opr==1)
				result=fn-sc;
			else if (opr==2)
				try{
					result=fn/sc;
				}
			catch(Exception e)
			{
				result=Double.POSITIVE_INFINITY;
			}
			else if (opr==3)
				result=fn*sc;
			
			return result;
		}
}