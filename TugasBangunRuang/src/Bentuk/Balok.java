package Bentuk;

public class Balok extends TampungBentuk {

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
	}
	
	public void calculate(int p, int l, int t)
	{
		double luas = 2*((p*l) + (p*t) + (l*t));
		System.out.println(luas);
	}
	
	public void calculateKeliling(int p, int l, int t)
	{
		double keliling = 4*(p+l+t);
		System.out.println(keliling);
	}
	
	public void calculateVolume(int p, int l, int t)
	{
		double volume = p*l*t;
		System.out.println(volume);
	}

	public Balok() {
		// TODO Auto-generated constructor stub
	}

}
