package java101PatikaDev;

import java.util.Scanner;

public class KDVTutarýHesaplama {

	public static void main(String[] args) {

		double tutar;
		double kdvOraný = 0.18;
		double kdvTutarý;
		double kdvliFiyat;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Tutarý giriniz: ");
		tutar = scanner.nextDouble();
		
		kdvTutarý = tutar * kdvOraný;
		kdvliFiyat = tutar + kdvTutarý;
		
		System.out.println("Kdv'siz Tutar : " + tutar);
		System.out.println("Kdv Oraný : " + kdvOraný);
		System.out.println("Kdv Tutarý : " + kdvTutarý);
		System.out.println("Kdv'li Tutarý: " + kdvliFiyat);
		
		
		
	}

}
