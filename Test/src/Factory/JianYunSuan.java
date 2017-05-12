package Factory;

public class JianYunSuan implements YunSuan {

	@Override
	public double jisuan(double a, double b) {
		double c=a-b;
		return c;
	}

}
