package java101PatikaDev;

import java.util.Scanner;

public class KDVTutar�Hesaplama {

	public static void main(String[] args) {

		double tutar;
		double kdvOran� = 0.18;
		double kdvTutar�;
		double kdvliFiyat;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen Tutar� giriniz: ");
		tutar = scanner.nextDouble();
		
		kdvTutar� = tutar * kdvOran�;
		kdvliFiyat = tutar + kdvTutar�;
		
		System.out.println("Kdv'siz Tutar : " + tutar);
		System.out.println("Kdv Oran� : " + kdvOran�);
		System.out.println("Kdv Tutar� : " + kdvTutar�);
		System.out.println("Kdv'li Tutar�: " + kdvliFiyat);
		
		
		
	}

}
