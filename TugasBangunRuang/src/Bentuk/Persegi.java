package Bentuk;

public class Persegi extends TampungBentuk {
	

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
	}
	
	public void calculate(int sis)
	{
		double luas = sis*sis;
		System.out.println(luas);
	}
	
	public void calculateKeliling(int sisKeliling)
	{
		double keliling = 4*sisKeliling;
		System.out.println(keliling);
	}

	public Persegi() {
		// TODO Auto-generated constructor stub
	}

}
