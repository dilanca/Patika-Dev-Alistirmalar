package java101PatikaDev;

import java.util.Scanner;

public class VücutKitleIndeksiHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double Kilo, Boy, Sonuç;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Boyunuzu girin. Örn. 1,75");
		Boy = scanner.nextDouble();
		System.out.println("Kilonuzu girin.");
		Kilo = scanner.nextDouble();
		
	
		Sonuç = Kilo / (Boy*Boy);
		 
		System.out.println("Vücut kitle endeksiniz " + Sonuç);
		
		
		
		
	}

}
