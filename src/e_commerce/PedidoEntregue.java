package e_commerce;

public class PedidoEntregue implements PedidoState {

	
	public PedidoState iniciarPedidoNovo() {
		System.out.println("Novo Pedido");
		return this;
	}

	
	public PedidoState fazerAprovacaoDePedido() {
		System.out.println("Pedido Aprovado");
		return new PedidoAprovado();
	}

	
	public PedidoState informarPedidoEmTransporte() {
		System.out.println("Pedido em Transporte");
		return new PedidoEmTransporte();
	}

	
	public PedidoState fazerEntregaDePedito() {
		System.out.println("Pedido Entregue");
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
	
	public PedidoState verificarPedidoEntregue() {
		System.out.println("Pedido OK");
		return new PeditoFinalizado();
	}

}
