package java101PatikaDev;

import java.util.Scanner;

public class V�cutKitleIndeksiHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double Kilo, Boy, Sonu�;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Boyunuzu girin. �rn. 1,75");
		Boy = scanner.nextDouble();
		System.out.println("Kilonuzu girin.");
		Kilo = scanner.nextDouble();
		
	
		Sonu� = Kilo / (Boy*Boy);
		 
		System.out.println("V�cut kitle endeksiniz " + Sonu�);
		
		
		
		
	}

}
