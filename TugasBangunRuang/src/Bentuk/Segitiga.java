package Bentuk;

public class Segitiga extends TampungBentuk {
	

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
	}
	
	public void calculate(int a, int t)
	{
		double luas = 0.5*a*t;
		System.out.println(luas);
	}
	
	public void calculate(int sis)
	{
		double keliling = 3*sis;
		System.out.println(keliling);
	}
	
	public Segitiga() {
		// TODO Auto-generated constructor stub
	}

}
