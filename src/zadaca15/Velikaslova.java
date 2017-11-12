package zadaca15;
import java.util.Scanner;
public class Velikaslova {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite string:");
		String recenica;
		char slovo;
		recenica = unos.nextLine();
		int brojac=0,brojac1=0,brojac2=0;
		while(brojac<recenica.length()){
			slovo = recenica.charAt(brojac);
			if(Character.isUpperCase(slovo))
			{
				brojac1++;
			}
			brojac++;
		}
		System.out.println("Postotak velikih slova je " +brojac1 );
	}
	

}
