package java101PatikaDev;
import java.util.Scanner;

public class TaksimetreHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double mesafe, fiyat;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hesaplamak istediðiniz mesafeyi km cinsinden giriniz");
		mesafe = scanner.nextDouble();
		
		fiyat =  (10 + (mesafe*2.20));
		
		fiyat = (fiyat < 20 ) ? 20 : fiyat;
		
		System.out.println("Toplam tutarýnýz : " + fiyat);
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
