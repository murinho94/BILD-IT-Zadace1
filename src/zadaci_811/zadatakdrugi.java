package zadaci_811;
import java.util.Scanner;
public class zadatakdrugi {

	public static void main(String[] args) {
	Scanner unos = new Scanner(System.in);
	int brojevi=1,neg=0,poz=0;
	double suma=0;
	while(brojevi != 0)
	{
		System.out.println("Unesite novi broj, za prekid unesite 0:");
		brojevi=unos.nextInt();
		suma = suma + brojevi;
		if(brojevi<0){
			neg++;
		}
		else if(brojevi>0){
			poz++;
		}
	}
	System.out.println("Unijeli ste "+neg+" negativnih brojeva i "+poz+" pozitivnih brojeva");
	System.out.println("Suma svih brojeva je "+suma+" , a prosjek iznosi "+ suma/(neg+poz));
	unos.close();
	}

}
