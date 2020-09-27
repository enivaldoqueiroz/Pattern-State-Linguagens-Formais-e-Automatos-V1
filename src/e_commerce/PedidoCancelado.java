package e_commerce;

public class PedidoCancelado implements PedidoState {

	
	public PedidoState iniciarPedidoNovo() {
		
		return null;
	}

	
	public PedidoState fazerAprovacaoDePedido() {
		
		return null;
	}

	
	public PedidoState informarPedidoEmTransporte() {
		
		return null;
	}

	
	public PedidoState fazerEntregaDePedito() {
		
		return null;
	}

	
	public PedidoState cancelarPedido() {
		
		return null;
	}

	
	public PedidoState finalizarPedido() {
		
		return null;
	}
	
	public PedidoState verificarPedidoEntregue() {
		System.out.println("Pedido OK");
		return new PeditoFinalizado();
	}

}
