package zadaci_811;
import java.util.Scanner;
public class stoparacun {

	public static void main(String[] args) {
	Scanner unos = new Scanner(System.in);
	System.out.println("Unesite iznos mjese�ne �tednje:");
	double uplatamjesec = unos.nextDouble();
	System.out.println("Unesite broj mjeseci:");
	int mjeseci=unos.nextInt();
	double stopa=(1+0.00417);
	double racun=0;
	int brojac=0;
	while(brojac<mjeseci){
		racun=(uplatamjesec + racun) * stopa;
		brojac++;
	}
	System.out.println("Va� ra�un nakon "+mjeseci+" mjeseca iznosi "+racun);
	unos.close();
	}

}
