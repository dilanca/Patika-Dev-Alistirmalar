package java101PatikaDev;

import java.util.Scanner;

public class ManavKasaProgramý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double armut, elma, domates, muz, patlýcan, tutar;
		double kgArmut = 2.14, kgElma = 3.67, kgDomates = 1.11, kgMuz = 0.95, kgPatlýcan = 5.00;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kaç kilo armut? ");
		armut = scanner.nextDouble();
		
		System.out.println("Kaç kilo elma? ");
		elma = scanner.nextDouble();
		
		System.out.println("Kaç kilo domates? ");
		domates = scanner.nextDouble();
		
		System.out.println("Kaç kilo muz? ");
		muz = scanner.nextDouble();
		
		System.out.println("Kaç kilo patlýcan? ");
		patlýcan = scanner.nextDouble();
		 
		tutar = ((armut*kgArmut) + (elma*kgElma) + (domates*kgDomates) + (muz*kgMuz) + (patlýcan*kgPatlýcan));
		
		System.out.println("Toplam Tutar : " + tutar + " TL");
		
		
		
		
		
		
		
		
		
	}

}
