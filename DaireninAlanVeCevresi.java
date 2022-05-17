package java101PatikaDev;

import java.util.Scanner;

public class DaireninAlanVeCevresi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r;
		double pi = 3.14;
		double alan, cevre;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dairenin yarý çapýný giriniz.");
		r = scanner.nextDouble();
		
		alan = pi*r*r;
		cevre = 2*pi*r;
		
		System.out.println("Dairenin alaný: " + alan);
		System.out.println("Dairenin çevresi: " + cevre);
		
		
		
		
		
		
		
	}

}
