package Bentuk;

import java.util.Scanner;

public class Main {
	
	int menu, menuLuas, menuKeliling, menuVolume;
	int alas, tinggi, sisi, panjang, lebar, jari, diameter;
	double kelLing = 1.33;
	
	Scanner scan = new Scanner(System.in);
	
	Segitiga s = new Segitiga();
	Persegi p = new Persegi();
	PersegiPanjang pp = new PersegiPanjang();
	Lingkaran l = new Lingkaran();
	Kubus k = new Kubus();
	Balok b = new Balok();
	Bola bl = new Bola();
	
	public Main()
	{
		do 
		{
			System.out.println("1. Hitung luas");
			System.out.println("2. Hitung keliling");
			System.out.println("3. Hitung Volume");
			System.out.println("4. Exit");
			System.out.print("Choose >> ");
			menu = scan.nextInt(); scan.nextLine();
			
			System.out.println(" ");
			
			if (menu == 1) 
			{
				do 
				{
					System.out.println("1. Segitiga");
					System.out.println("2. Persegi");
					System.out.println("3. Persegi panjang");
					System.out.println("4. Lingkaran");
					System.out.println("5. Kubus");
					System.out.println("6. Balok");
					System.out.println("7. Bola");
					System.out.println("8. Exit");
					System.out.print("Choose >> ");
					menuLuas = scan.nextInt(); scan.nextLine();
					
					System.out.println(" ");
					
					if (menuLuas == 1) 
					{
						System.out.print("Alas : ");
						alas = scan.nextInt(); scan.nextLine();
						System.out.print("Tinggi : ");
						tinggi = scan.nextInt(); scan.nextLine();
						
						s.calculate(alas, tinggi);
						System.out.println(" ");
					}
					if (menuLuas == 2)
					{
						System.out.print("Sisi : ");
						sisi = scan.nextInt(); scan.nextLine();
						
						p.calculate(sisi);
						System.out.println(" ");
					}
					if (menuLuas == 3) 
					{
						System.out.print("Panjang : ");
						panjang = scan.nextInt(); scan.nextLine();
						System.out.print("Lebar : ");
						lebar = scan.nextInt(); scan.nextLine();
						
						pp.calculate(panjang, lebar);
						System.out.println(" ");
					}
					if (menuLuas == 4) 
					{
						System.out.print("Jari-jari : ");
						jari = scan.nextInt(); scan.nextLine();
						
						l.calculateLuas(Math.PI, jari);
						System.out.println(" ");
					}
					if (menuLuas == 5)
					{
						System.out.print("Sisi : ");
						sisi = scan.nextInt(); scan.nextLine();
						
						k.calculate(sisi);
						System.out.println(" ");
					}
					if (menuLuas == 6) 
					{
						System.out.print("Panjang : ");
						panjang = scan.nextInt(); scan.nextLine();
						System.out.print("Lebar : ");
						lebar = scan.nextInt(); scan.nextLine();
						System.out.print("Tinggi : ");
						tinggi = scan.nextInt(); scan.nextLine();
						
						b.calculate(panjang, lebar, tinggi);
						System.out.println(" ");
					}
					if (menuLuas == 7) 
					{
						System.out.print("Jari-jari : ");
						jari = scan.nextInt(); scan.nextLine();
						
						bl.calculate(Math.PI, jari);
						System.out.println(" ");
					}
				} while (menuLuas != 8);
			}
			if (menu == 2)
			{
				do 
				{
					System.out.println("1. Segitiga");
					System.out.println("2. Persegi");
					System.out.println("3. Persegi panjang");
					System.out.println("4. Lingkaran");
					System.out.println("5. Kubus");
					System.out.println("6. Balok");
					System.out.println("7. Bola");
					System.out.println("8. Exit");
					System.out.print("Choose >> ");
					menuKeliling = scan.nextInt(); scan.nextLine();
					
					System.out.println(" ");
					
					if (menuKeliling == 1) 
					{
						System.out.print("Sisi : ");
						sisi = scan.nextInt(); scan.nextLine();
						
						s.calculate(sisi);
						System.out.println(" ");
					}
					if (menuKeliling == 2)
					{
						System.out.print("Sisi : ");
						sisi = scan.nextInt(); scan.nextLine();
						
						p.calculateKeliling(sisi);
						System.out.println(" ");
					}
					if (menuKeliling == 3)
					{
						System.out.print("Panjang : ");
						panjang = scan.nextInt(); scan.nextLine();
						System.out.print("Lebar : ");
						lebar = scan.nextInt(); scan.nextLine();
						
						pp.calculateKeliling(panjang, lebar);
						System.out.println(" ");
					}
					if (menuKeliling == 4) 
					{
						System.out.print("Diameter : ");
						diameter = scan.nextInt(); scan.nextLine();
						
						l.calculateKeliling(Math.PI, diameter);
						System.out.println(" ");
					}
					if (menuKeliling == 5) 
					{
						System.out.print("Sisi : ");
						sisi = scan.nextInt(); scan.nextLine();
						
						k.calculateKeliling(sisi);
						System.out.println(" ");
					}
					if (menuKeliling == 6)
					{
						System.out.print("Panjang : ");
						panjang = scan.nextInt(); scan.nextLine();
						System.out.print("Lebar : ");
						lebar = scan.nextInt(); scan.nextLine();
						System.out.print("Tinggi :");
						tinggi = scan.nextInt(); scan.nextLine();
						
						b.calculateKeliling(panjang, lebar, tinggi);
						System.out.println(" ");
					}
					if (menuKeliling == 7)
					{
						System.out.print("Jari-jari : ");
						jari = scan.nextInt(); scan.nextLine();
						
						bl.calculateKeliling(kelLing, Math.PI, jari);
						System.out.println(" ");
					}
				} while (menuKeliling != 8);
			}
			if (menu == 3) 
			{
				do 
				{
					System.out.println("1. Kubus");
					System.out.println("2. Balok");
					System.out.println("3. Bola");
					System.out.println("4. Exit");
					System.out.print("Choose >> ");
					menuVolume = scan.nextInt(); scan.nextLine();
					
					System.out.println(" ");
					
					if (menuVolume == 1)
					{
						System.out.print("Sisi : ");
						sisi = scan.nextInt(); scan.nextLine();
						
						k.calculateVolume(sisi);
						System.out.println(" ");
					}
					if (menuVolume == 2)
					{
						System.out.print("Panjang : ");
						panjang = scan.nextInt(); scan.nextLine();
						System.out.print("Lebar : ");
						lebar = scan.nextInt(); scan.nextLine();
						System.out.print("Tinggi : ");
						tinggi = scan.nextInt(); scan.nextLine();
						
						b.calculateVolume(panjang, lebar, tinggi);
						System.out.println(" ");
					}
					if (menuVolume == 3)
					{
						System.out.print("jari-jari : ");
						jari = scan.nextInt(); scan.nextLine();
						
						bl.calculateVolume(kelLing, Math.PI, jari);
						System.out.println(" ");
					}
				} while (menuVolume != 4);
			}
		} while (menu != 4);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Main();
	}

}
