package zadaca16;
import java.util.Scanner;
public class ASCII {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ASCII kod (cijeli broj od 0 do 127): ");
		int slovo = unos.nextInt();
		System.out.println((char)slovo);
	}

}
