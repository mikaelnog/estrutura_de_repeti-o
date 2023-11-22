import java.util.Scanner;

public class estrutura_repetição_1 {

	
	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("digite uma senha:");
		int senha=sc.nextInt();
		while (senha!=8523) {
			
			System.out.println("senha incorreta!");
				
				senha=sc.nextInt();
			
		}
			System.out.println("senha correta!");
				sc.close();
	}
	

}
