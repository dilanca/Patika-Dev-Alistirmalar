package java101PatikaDev;

import java.util.Scanner;

public class ManavKasaProgram� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double armut, elma, domates, muz, patl�can, tutar;
		double kgArmut = 2.14, kgElma = 3.67, kgDomates = 1.11, kgMuz = 0.95, kgPatl�can = 5.00;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ka� kilo armut? ");
		armut = scanner.nextDouble();
		
		System.out.println("Ka� kilo elma? ");
		elma = scanner.nextDouble();
		
		System.out.println("Ka� kilo domates? ");
		domates = scanner.nextDouble();
		
		System.out.println("Ka� kilo muz? ");
		muz = scanner.nextDouble();
		
		System.out.println("Ka� kilo patl�can? ");
		patl�can = scanner.nextDouble();
		 
		tutar = ((armut*kgArmut) + (elma*kgElma) + (domates*kgDomates) + (muz*kgMuz) + (patl�can*kgPatl�can));
		
		System.out.println("Toplam Tutar : " + tutar + " TL");
		
		
		
		
		
		
		
		
		
	}

}
