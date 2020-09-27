package e_commerce;

public class PedidoEmTransporte implements PedidoState {

	@Override
	public PedidoState iniciarPedidoNovo() {
		
		return null;
	}

	@Override
	public PedidoState fazerAprovacaoDePedido() {
		
		return null;
	}

	@Override
	public PedidoState informarPedidoEmTransporte() {
		
		return null;
	}

	@Override
	public PedidoState fazerEntregaDePedito() {
		
		return null;
	}

	@Override
	public PedidoState cancelarPedido() {
		
		return null;
	}

	@Override
	public PedidoState finalizarPedido() {
		
		return null;
	}
	
	public PedidoState verificarPedidoEntregue() {
		System.out.println("Pedido OK");
		return new PeditoFinalizado();
	}

}
