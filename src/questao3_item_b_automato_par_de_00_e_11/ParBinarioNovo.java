package questao3_item_b_automato_par_de_00_e_11;



public class ParBinarioNovo implements ParBinarioState {
	
	public ParBinarioState exibirCadeiaAceita(String s) {
		if(s.contains("00") == true && s.contains("11") == true) {
			System.out.println("A cadeia é aceita: " + s);
		}else {
			System.out.println("A cadeia não é aceita: " + s);
		}
		return new ParBinarioAceito();
	}

	
	public ParBinarioState exibirCadeiaNaoAceita(String s) {
		if(s.contains("00") == false && s.contains("11") == false) {
			System.out.println("A cadeia não é aceita: " + s);
		}else {
			System.out.println("A cadeia é aceita: " + s);
		}
		return new ParBinarioNaoAceito();
	}
}
