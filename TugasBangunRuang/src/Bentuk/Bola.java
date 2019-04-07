package Bentuk;

public class Bola extends TampungBentuk {

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
	}
	
	public void calculate(double phi, int r)
	{
		double luas = 4*Math.PI*r*r; 
		System.out.println(luas);
	}
	
	public void calculateKeliling(double kelLing, double phi, int r)
	{
		double keliling = kelLing*Math.PI*r*r;
		System.out.println(keliling);
	}
	
	public void calculateVolume(double kelLing, double phi, int r)
	{
		double volume = kelLing*Math.PI*r*r*r;
		System.out.println(volume);
	}
	
	public Bola() {
		// TODO Auto-generated constructor stub
	}

}
