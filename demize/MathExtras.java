package demize;

/**
 * @author demize95
 * @version 0.1
 */



/**
 * Adds extra functionality not in standard java math functions.
 */
public class MathExtras	{
	
	/**
	 * Rounds a double to the specified amount of decimal places. If 0 is specified as the amount of places, the number is just forwarded to Math.round().
	 * @param 	d	The double you want to round.
	 * @param	places	The amount of decimal places to round to.
	 * @return	double result
	 */
	public static double round(double d, int places)
	{
		double result;
		int p = 10;
		for(int i = 1; i < places; i++) p *= 10;
		if(places > 0)
		{
		result = d*p;
		result = Math.rint(result);
		result = result/p;
		}
		else if(places == 0)
		{
			return Math.round(d);
		}
		else
		{
			return -1;
		}
		return result;
	}
	
	/**
	 * Random number generation. Generates a random number within the specified range and rounds it to the specified amount of decimal places.
	 * @param min The minimum value allowed
	 * @param max The maximum value allowed
	 * @param places The decimal places to round to.
	 * @return A random double with the specified minimum, maximum and decimal places
	 */
	public static double random(double min, double max, int places)
	{
		double ret;
		
		ret = Math.random()*900000000 % max-min;
		
		ret += min;
		
		ret = round(ret, places);
		
		return ret;
	}
	
}
