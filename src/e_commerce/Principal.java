package e_commerce;

public class Principal {

	public static void main(String[] args) {
		
		//Pedido 01
		Pedido pedido01 = new Pedido();		
		
		pedido01.iniciarPedidoNovo();
		//Tempo máximo para cancelamento de pedido é 14
		pedido01.fazerAprovacaoDePedido(17);
		pedido01.informarPedidoEmTransporte();
		pedido01.fazerEntregaDePedito();
		//OP: 1 p/ Pedido entregue Errado e OP: 02 p/ Pedido OK
		pedido01.verificarPedidoEntregue(2);
		pedido01.finalizarPedido();
		
//		System.out.println("\n");
//		//Pedido 02
//		Pedido pedido02 = new Pedido();		
//				
//		pedido02.iniciarPedidoNovo();
//		pedido02.fazerAprovacaoDePedido(20);
//		pedido02.informarPedidoEmTransporte();
//		pedido02.fazerEntregaDePedito(1);
//		pedido02.verificarPedidoEntregue();
//		pedido02.finalizarPedido();

	}

}
