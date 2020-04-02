//	Create a method that takes two integers as arguments and return their sum.

public class MainClass 
{
	public static void main(String[] args)
	{
		int a = 6;
		int b = 6;
		
		Adder add = new Adder();
		System.out.println("The addition of " + a + " & " + b + " = " + add.add(a, b));
	}
}
