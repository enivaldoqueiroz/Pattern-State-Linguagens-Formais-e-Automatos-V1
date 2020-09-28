package questao3_item_b_automato_par_de_00_e_11;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
			ParBinario jargao = new ParBinario();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite a cadeia de caracteres: ");
			String myString = scanner.next();		
			scanner.close();
						
			jargao.exibirCadeiaAceita(myString);
			jargao.exibirCadeiaNaoAceita(myString);
		

	}

}
