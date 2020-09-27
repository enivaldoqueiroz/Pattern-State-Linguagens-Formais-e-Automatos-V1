package e_commerce;

public class Pedido {
	
	protected PedidoState estado;
	
	//Construtor da classe Pedido
	public Pedido() {
		estado = new PedidoNovo();
	}
	
	//Metodos
	public void iniciarPedidoNovo() {
		estado = estado.iniciarPedidoNovo();
	}
	
	public void fazerAprovacaoDePedido() {
		estado = estado.fazerAprovacaoDePedido();
	}
	
	public void informarPedidoEmTransporte() {
		estado = estado.informarPedidoEmTransporte();
	}
	
	public void fazerEntregaDePedito() {
		estado = estado.fazerEntregaDePedito();
	}
	
	public void verificarPedidoEntregue() {
		estado = estado.verificarPedidoEntregue();
	}
	
	public void cancelarPedido() {
		estado = estado.cancelarPedido();
	}
	
	public void finalizarPedido() {
		estado = estado.finalizarPedido();
	}
		
	

}
