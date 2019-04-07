package Bentuk;

public class Lingkaran extends TampungBentuk {

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
	}
	
	public void calculateLuas(double phi,int r)
	{
		double luas = Math.PI*r*r;
		System.out.println(luas);
	}
	
	public void calculateKeliling(double phi, int d)
	{
		double keliling = Math.PI*d;
		System.out.println(keliling);
	}

	public Lingkaran() {
		// TODO Auto-generated constructor stub
	}

}
