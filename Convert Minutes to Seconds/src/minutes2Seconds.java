
public class minutes2Seconds 
{
	private int _min;
	
	public minutes2Seconds(int min)
	{
		_min = min;
		convertMins2Secs(_min);
	}
	
	public int convertMins2Secs()
	{
		return _min * 60;
	}
	
	public int convertMins2Secs(int min)
	{
		return _min * 60;
	}
}
