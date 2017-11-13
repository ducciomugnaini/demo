package share;

public class AdvancedCalculator {

	double a;
	double b;
	
	public AdvancedCalculator(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
	public double Pow() {
		return Math.pow(a, b);
	}
	
	public double Mul()
	{
		return a*b;
	}
	
	
}
