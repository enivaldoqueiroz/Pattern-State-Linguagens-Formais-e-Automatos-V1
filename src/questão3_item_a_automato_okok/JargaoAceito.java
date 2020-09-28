package quest�o3_item_a_automato_okok;



public class JargaoAceito implements JargaoState {
	
	public JargaoState exibirCadeiaAceita(String s) {
		if(s.contains("ok") == true) {
			System.out.println("A cadeia � aceita: " + s);
		}
		return this;
	}

	
	public JargaoState exibirCadeiaNaoAceita(String s) {
		if(s.contains("ok") == false) {
			System.out.println("A cadeia n�o � aceita: " + s);
		}
		return new JargaoNaoAceito();
	}


}
