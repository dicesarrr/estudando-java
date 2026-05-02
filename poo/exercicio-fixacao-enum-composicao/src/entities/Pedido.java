package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.PedidoStatus;

public class Pedido {
	
	private static final SimpleDateFormat formatoDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date momento;
	private PedidoStatus status;
	
	private Cliente cliente;
	
	List<ItemPedido> itens = new ArrayList<>();
	
	public Pedido() {
	}

	public Pedido(Date momento, PedidoStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void adicionarItem(ItemPedido item) {
		itens.add(item);
	}
	
	public void removerItem(ItemPedido item) {
		itens.remove(item);
	}

	public double precoTotal() {
		double soma = 0.0;
		for (ItemPedido item : itens) {
			soma += item.subTotal();
		}
		return soma;
	}
	
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("Momento do pedido: " + formatoDataHora.format(momento) + "\n");
		string.append("Status do pedido: " + status + "\n");
		string.append("Cliente: " + cliente + "\n");
		string.append("Itens pedidos: " + "\n");
		for (ItemPedido item : itens) {
			string.append(item +  "\n");
		}
		string.append("Preço total: $" + String.format("%.2f", precoTotal()));
		
		return string.toString();
	}
	
	
	
}
