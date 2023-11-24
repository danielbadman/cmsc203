
public class Function4 extends Function{

	@Override
	public double fnValue(double x) {
		return x*x*x - 7*x*x + 15*x - 9;
	}
	
	public String toString() {
		return "x^3 - 7*x^2 + 15*x - 9";
	}

}
