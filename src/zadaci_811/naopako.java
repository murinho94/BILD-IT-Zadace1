package zadaci_811;
import java.util.Scanner;
public class naopako {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("unesite broj koji želite obrnuti:");
		int broj=unos.nextInt();
		int naopako=0;
			while (broj/10 != 0)
			{    
		    naopako= broj%10*10 + naopako*10; 
		    broj = broj / 10; 
		}
		System.out.println(naopako+broj);
	}
}
