package zadaca16;

public class Armstrong {

	public static void main(String[] args) {
		 int n;
		 int b,suma = 0;
		 System.out.print("Armstrongovi brojevi od 1 do 1000 su: ");
		 for(int i=1;i<=1000;i++)
	        {
	            n=i;
	            while(n>0)
	            {
	                b=n%10;
	                suma=suma+(b*b*b);
	                n=n/10;
	            }
	            if(suma==i)
	            {
	                System.out.print(i+" ");
	            }
	            suma=0;
	        }
	}

}
