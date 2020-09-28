package e_commerce;

public class Principal {

	public static void main(String[] args) {
		
		Pedido pedido01 = new Pedido();
		
		//Pedido 01
		pedido01.iniciarPedidoNovo();
		pedido01.fazerAprovacaoDePedido();
		pedido01.informarPedidoEmTransporte();
		pedido01.fazerEntregaDePedito();
		pedido01.verificarPedidoEntregue();
		pedido01.finalizarPedido();

	}

}
