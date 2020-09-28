package e_commerce;

public class PedidoEntregue implements PedidoState {

	
	public PedidoState iniciarPedidoNovo() {
		System.out.println("Novo Pedido");
		return this;
	}

	
	public PedidoState fazerAprovacaoDePedido(int temp) {
		if(temp < 15) {
			System.out.println("Pedido Cancelado");
			return new PedidoCancelado();
		}else {
			System.out.println("Pedido Aprovado");
			System.out.println("Pedido em Preparação");
		}
		
		return new PedidoAprovado();
	}

	
	public PedidoState informarPedidoEmTransporte() {
		System.out.println("Pedido em Transporte");
		return new PedidoEmTransporte();
	}

	
	public PedidoState fazerEntregaDePedito() {
				
		return this;
	}

	
	public PedidoState cancelarPedido() {
		System.out.println("Pedido Cancelado");
		return new PedidoCancelado();
	}

	
	public PedidoState finalizarPedido() {
		System.out.println("Pedido Finalizado");
		return new PeditoFinalizado();
	}
	
	public PedidoState verificarPedidoEntregue(int op) {
		if(op == 1) {
			System.out.println("Pedido Entregue Erro");
			System.out.println("Pedido Cancelado");
			return new PedidoCancelado();
		}else if (op == 2)	{
			System.out.println("Pedido Entregue");
			System.out.println("Pedido OK");
		}
		
		return new PeditoFinalizado();
	}


	
}
