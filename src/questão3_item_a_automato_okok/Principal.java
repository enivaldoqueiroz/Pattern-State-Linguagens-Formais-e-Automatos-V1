package questão3_item_a_automato_okok;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
			Jargao jargao = new Jargao();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite a cadeia de caracteres: ");
			String myString = scanner.next();		
			scanner.close();
						
			jargao.exibirCadeiaAceita(myString);
			jargao.exibirCadeiaNaoAceita(myString);
		

	}

}
