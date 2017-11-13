package share;

public class Calculator {
	
	int a;
	int b;
	
	
	public Calculator (int a, int b) 
	{
		this.a = a;
		this.b = b;
	}
	
	public int Sum()
	{
		return a+b;
	}
	
	public int Sub() 
	{
		return a-b;
	}
	
}
