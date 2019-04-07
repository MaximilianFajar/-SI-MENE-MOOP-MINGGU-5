package Bentuk;

public class PersegiPanjang extends TampungBentuk {
	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
	}
	
	public void calculate(int p, int l)
	{
		double luas = p*l;
		System.out.println(luas);
	}
	
	public void calculateKeliling(int p, int l)
	{
		double keliling = 2*(p+l);
		System.out.println(keliling);
	}

	public PersegiPanjang()
	{
		
	}
}
