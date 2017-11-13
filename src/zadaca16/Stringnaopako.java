package zadaca16;

import java.util.Scanner;

public class Stringnaopako {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite sting koji želite da ispišete naopako:");
		String recenica=unos.nextLine();
		String naopako = new StringBuilder(recenica).reverse().toString();
		System.out.println(naopako);
	}

}
