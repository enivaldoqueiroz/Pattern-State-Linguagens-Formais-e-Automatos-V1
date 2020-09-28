package questao3_item_b_automato_par_de_00_e_11;


public class ParBinario {
	
	protected ParBinarioState estado;

	//Contrutor da classe Jargao
	public ParBinario() {
		estado = new ParBinarioNovo();
	}
	
	//Metodos da classe ParBinario
	public void exibirCadeiaAceita(String s){
		estado = estado.exibirCadeiaAceita(s);
	}
	
	public void exibirCadeiaNaoAceita(String s){
		estado = estado.exibirCadeiaNaoAceita(s);
	}
}
