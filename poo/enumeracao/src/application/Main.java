package application;

import java.util.Date;

import entities.Pedido;
import entities.enums.StatusPedido;

public class Main {

	public static void main(String[] args) {
		
		// Utilizando enum
		
		Pedido pedido = new Pedido(1800, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
		System.out.println(pedido);

		// Conversão de String para enum
		
		StatusPedido spEntregue1 = StatusPedido.ENTREGUE;
		StatusPedido spEntregue2 = StatusPedido.valueOf("ENTREGUE");;
		
		System.out.println(spEntregue1);
		System.out.println(spEntregue2);
		
	}

}
