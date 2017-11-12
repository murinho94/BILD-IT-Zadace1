package zadaca15;
import java.util.Scanner;
public class procenat {

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
			else if(Character.isLowerCase(slovo))
			{
				brojac2++;
			}
			brojac++;
		}
		System.out.println("Postotak velikih slova je " + 100 * brojac1 / recenica.length() + " a malih " + 100 * brojac2 / recenica.length() );
	}

}
