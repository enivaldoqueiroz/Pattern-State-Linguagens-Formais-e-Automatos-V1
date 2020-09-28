package questão3_item_a_automato_okok;

public class Jargao {
	

	protected JargaoState estado;

	//Contrutor da classe Jargao
	public Jargao() {
		estado = new JargaoNovo();
	}
	
	//Metodos da classe Jargao
	public void exibirCadeiaAceita(String s){
		estado = estado.exibirCadeiaAceita(s);
	}
	
	public void exibirCadeiaNaoAceita(String s){
		estado = estado.exibirCadeiaNaoAceita(s);
	}
	
}
