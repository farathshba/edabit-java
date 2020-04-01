/*
 * Write a function that takes an integer minutes and converts it to seconds.

Examples
convert(5) ➞ 300

convert(3) ➞ 180

convert(2) ➞ 120
Notes
Don't forget to return the result.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.
 */
public class MainClass 
{
	public static void main(String[] args)
	{
		int minutes = 6;
		minutes2Seconds mn = new minutes2Seconds(minutes);
		
		System.out.println(minutes + " converted to seconds is " + mn.convertMins2Secs());
	}
}
