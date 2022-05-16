package java101PatikaDev;

import java.util.Scanner;

public class NotOrtalamasýHesaplama {

	public static void main(String[] args) {

		int math, physics, chemical, biology, history, music;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your math score: ");
		math = scanner.nextInt();
		
		System.out.println("Please enter your physics score: ");
		physics = scanner.nextInt();
		
		System.out.println("Please enter your chemical score: ");
		chemical = scanner.nextInt();
		
		System.out.println("Please enter your biology score: ");
		biology = scanner.nextInt();
		
		System.out.println("Please enter your history score: ");
		history = scanner.nextInt();
		
		System.out.println("Please enter your music score: ");
		music = scanner.nextInt();
		
		int total =  math + physics + chemical + biology + history + music;
		double average = total / 6;
		System.out.println(" Your average grade is : " + average );
		
		boolean result = average > 60;
		String res = result ? "Great, you can go next class!" : "Sorry, you can not go next class!" ;
		System.out.println(res);
		
		
	}

}
