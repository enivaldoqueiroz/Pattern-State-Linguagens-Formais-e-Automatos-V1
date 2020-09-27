package e_commerce;

public interface PedidoState {
	
	//Metodos de coportamento do Estado de pedido
	PedidoState iniciarPedidoNovo();
	PedidoState fazerAprovacaoDePedido();
	PedidoState informarPedidoEmTransporte();
	PedidoState fazerEntregaDePedito();
	PedidoState cancelarPedido();
	PedidoState finalizarPedido();
	PedidoState verificarPedidoEntregue(); 
	
	

}
