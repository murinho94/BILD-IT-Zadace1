package zadaci_811;
import java.util.Scanner;
public class zadatak1 {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj redova");
		int row=unos.nextInt();
		for (int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=row;i++)
		{
			for(int k=(row-i);k>=1;k--){
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--){
				System.out.print(j+" " );
			}
			
			System.out.println();
		}
		System.out.println();
		for(int i=row;i>=1;i--)
		{
			for(int j=row;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	unos.close();
}
}