package e_commerce;

public class PedidoCancelado implements PedidoState {

	
	public PedidoState iniciarPedidoNovo() {
		
		return null;
	}

	
	public PedidoState fazerAprovacaoDePedido(int temp) {
		
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
	
	public PedidoState verificarPedidoEntregue(int op) {
		if(op == 1) {
			System.out.println("Pedido Entregue Erro");
			System.out.println("Pedido Cancelado");
			return new PedidoCancelado();
		}else if (op == 2)	{
			System.out.println("Pedido Entregue");
		}
		
		return new PeditoFinalizado();
	}



}
