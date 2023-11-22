import java.util.Scanner;
//Substituindo_if/else_por_Switch_case
public class Main_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
	
		String um="cachorro quente";
		String dois="X-salda";
		String tres="X-bacon";
		String quatro="Torrada simples";
		String cinco="refrigerante";
		//
		Scanner F=new Scanner(System.in);
		System.out.print("Quantidade:");
		int QTD= F.nextInt();
		System.out.print("Codigo:");
		int codigo= F.nextInt();
							//estrutura_Condicional_switch_Case
		switch(codigo) {
		case 1:
			System.out.println("Produto:"+um+ " Quantidade:"+QTD+" Valor R$: "+QTD*4.00);
			break;
		case 2:
			System.out.println("Produto:" +dois+ " Quantidade:" +QTD+ " Valor R$: "+QTD*4.5);
			break;
		case 3:
			System.out.println("Produto:" +tres+ " Quantidade:" +QTD+ " Valor R$: "+QTD*5.00);
			break;
		case 4:
			System.out.println("Produto:" +quatro+ " Quantidade:" +QTD+ " Valor R$: "+QTD*2.00);
			break;
		case 5:
			System.out.println("Produto:" +cinco+ " Quantidade:" +QTD+ "Valor R$: "+QTD*1.5);
			break;
		default:
			System.out.println("Código invalido! Reinicie o app");
			break;
		}
							//estrutura_condicional_if/else	
		//System.out.println("PRODUTO: " +um+ " QUANTIDADE: "+QTD+" VALOR R$:"+QTD*4);}
		//else if (codigo==2) {
		//System.out.println("PRODUTO: " +dois+ " QUANTIDADE: "+QTD+" VALOR R$:"+QTD*4.50);}
		//else if (codigo==3) {
		//System.out.println("PRODUTO: " +tres+ " QUANTIDADE: "+QTD+" VALOR R$:"+QTD*5.00);}
		//else if (codigo==4) {
		//System.out.println("PRODUTO: " +quatro+ " QUANTIDADE: "+QTD+" VALOR R$:"+QTD*2.00);}
		//else if (codigo==5) {
		//System.out.println("PRODUTO: " +cinco+ " QUANTIDADE: "+QTD+" VALOR R$:"+QTD*1.5);}
		//else{
		//	System.out.println("Código invalido" Reinicie o app!");
		
	
		
				F.close();
	}

}
