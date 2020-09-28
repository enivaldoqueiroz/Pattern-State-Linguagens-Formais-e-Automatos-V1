package e_commerce;

public interface PedidoState {
	
	//Metodos de comportamento do Estado de pedido
	PedidoState iniciarPedidoNovo();
	PedidoState fazerAprovacaoDePedido(int op);
	PedidoState informarPedidoEmTransporte();
	PedidoState fazerEntregaDePedito();
	PedidoState cancelarPedido();
	PedidoState finalizarPedido();
	PedidoState verificarPedidoEntregue(int op);
	
	
	

}
