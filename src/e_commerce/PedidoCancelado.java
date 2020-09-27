package e_commerce;

public class PedidoCancelado implements PedidoState {

	@Override
	public PedidoState iniciarPedidoNovo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PedidoState fazerAprovacaoDePedido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PedidoState informarPedidoEmTransporte() {
		// TODO Auto-generated method stub
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
