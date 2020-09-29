package e_commerce;

public class Principal {

	public static void main(String[] args) {
		
		//Pedido 01
		Pedido pedido01 = new Pedido();		
		
		pedido01.iniciarPedidoNovo();
		//Tempo máximo para cancelamento de pedido é 14 min
		pedido01.fazerAprovacaoDePedido(17);
		pedido01.informarPedidoEmTransporte();
		pedido01.fazerEntregaDePedito();
		//OP: 1 p/ Pedido entregue Errado e OP: 02 p/ Pedido OK
		pedido01.verificarPedidoEntregue(1);
		pedido01.finalizarPedido();
		

	}

}
