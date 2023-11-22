
import java.util.Scanner;

public class estrutura_repeticção_2 {



	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	String a="alcool.";
	String b="gasolina.";
	String c="diesel.";
	String d="fim.";
	System.out.println("CODIGOS:\r1:"+a+"\n2:"+b+"\n3:"+c+"\n4:"+d);
	int codigo=0;
	int alcool=0;
	int gasolina = 0;
	int diesel=0;
	
		while(codigo!=4) {
			System.out.println("Digite um código valido!:");
			codigo=sc.nextInt();
			if(codigo==1) {
				alcool=alcool+1;
				}
				else if(codigo==2) {
					gasolina=gasolina+1;
				}
				else if(codigo==3) {
					diesel=diesel+1;
				}
				 
			
				
		}
		
		System.out.println("Obrigado!");
		System.out.println("alcool:"+alcool);
		System.out.println("diesel:"+diesel);
		System.out.println("gasolina:"+gasolina);
		sc.close();
	}
	

}
