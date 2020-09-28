package e_commerce;

public class Pedido {
	
	protected PedidoState estado;
	
	//Construtor da classe Pedido
	public Pedido() {
		estado = new PedidoNovo();
	}
	
	//Metodos da classe Pedido
	public void iniciarPedidoNovo() {
		estado = estado.iniciarPedidoNovo();
	}
	
	public void fazerAprovacaoDePedido(int op) {
		estado = estado.fazerAprovacaoDePedido(op);
	}
	
	public void informarPedidoEmTransporte() {
		estado = estado.informarPedidoEmTransporte();
	}
	
	public void fazerEntregaDePedito() {
		estado = estado.fazerEntregaDePedito();
	}
	
	public void verificarPedidoEntregue(int op) {
		estado = estado.verificarPedidoEntregue(op);
	}
	
	public void cancelarPedido() {
		estado = estado.cancelarPedido();
	}
	
	public void finalizarPedido() {
		estado = estado.finalizarPedido();
	}
		
	

}
