import java.util.Locale;
import java.util.Scanner;
//area circulo
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner (System.in);	
	 double vlrraio=sc.nextDouble();
	double area=Math.pow(vlrraio,2);
    double pi=3.14159;
	double area_2= area*pi;
	System.out.printf("a area  do circulo é:%.4f%n",area_2);
    
	sc.close();
	}

}

