package Bentuk;

public class Kubus extends TampungBentuk {
	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
	}

	
	public void calculate(int sis)
	{
		double luas = 6*sis*sis;
		System.out.println(luas);
	}
	
	public void calculateKeliling(int sis)
	{
		double keliling = 12*sis;
		System.out.println(keliling);
	}
	
	public void calculateVolume(int sis)
	{
		double volume = sis*sis*sis;
		System.out.println(volume);
	}
	
	public Kubus() {
		// TODO Auto-generated constructor stub
	}

}
