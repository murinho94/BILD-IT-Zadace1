package zadaca16;
import java.util.Scanner;
public class Faktori {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj da bi ste vidjeli faktore: ");
		int broj = unos.nextInt();
		for (int i=1;i<=broj;i++) {

            if (broj%i==0)
                System.out.print(i + " ");
            
	}
	}
	}

