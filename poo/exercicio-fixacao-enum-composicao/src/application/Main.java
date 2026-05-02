package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.PedidoStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe os dados do cliente: ");
		
		System.out.print("Nome: ");
		String nomeCliente = sc.nextLine();
		System.out.print("E-mail: ");
		String emailCliente = sc.nextLine();
		System.out.print("Data de nascimento (DD/MM/AAAA): ");
		Date dataDeNascimentoCliente = formatoData.parse(sc.next());
		
		Cliente cliente = new Cliente(nomeCliente, emailCliente, dataDeNascimentoCliente);
		
		System.out.println();
		System.out.println("Informe os dados do pedido: ");
		
		System.out.print("Status: ");
		PedidoStatus statusPedido = PedidoStatus.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), statusPedido, cliente);
		
		System.out.print("Quantos items existem nesse pedido?: ");
		int quantidadeItemsPedido = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < quantidadeItemsPedido; i++) {
			System.out.printf("Informe os dados do #%d item: %n", i + 1);
			
			System.out.print("Nome do item: ");
			String nomeItemPedido = sc.nextLine();
			System.out.print("Preço do item: ");
			double precoItemPedido = sc.nextDouble();
			
			Produto produto = new Produto(nomeItemPedido, precoItemPedido);
			
			System.out.print("Quantidade: ");
			int quantidadeItemPedido = sc.nextInt(); 
			
			sc.nextLine();
			
			ItemPedido itemPedido = new ItemPedido(quantidadeItemPedido, precoItemPedido, produto);

			pedido.adicionarItem(itemPedido);
		}
		
		System.out.println();
		System.out.println("Resumo do Pedido: ");
		System.out.println(pedido);
		
		
		sc.close();
		
	}
	
}
