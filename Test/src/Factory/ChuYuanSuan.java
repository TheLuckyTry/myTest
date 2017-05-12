package Factory;

public class ChuYuanSuan implements YunSuan {

	@Override
	public double jisuan(double a, double b) {
		double c=a/b;
		return c;
	}

}
