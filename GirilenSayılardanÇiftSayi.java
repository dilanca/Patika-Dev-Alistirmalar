package java101PatikaDev;

import java.util.Scanner;

public class GirilenSayýlardanÇiftSayi {

	public static void main(String[] args) {
		int girdi;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayi giriniz : ");
		girdi = scanner.nextInt();
		
		for(int i = 1; i<= girdi; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
