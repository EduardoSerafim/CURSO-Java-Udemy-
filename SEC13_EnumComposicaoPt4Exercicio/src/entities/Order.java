package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	private Client cliente;
	private List<OrderItem> itens = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}
	

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public List<OrderItem> getItens() {
		return itens;
	}
	
	
	public void addItem(OrderItem item) {
		itens.add(item);
	}
	
	public void removeItem(OrderItem item) {
		itens.remove(item);
	}
	
	public double total() {
		double soma = 0;
		for (OrderItem c : itens) {
			soma += c.subTotal();
		}
		return soma;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (OrderItem o : itens) {
			sb.append(o.getProduct().getName() + ", ");
			sb.append("$" + o.getPrice() + ", ");
			sb.append("Quantity: " + o.getQuantity() + ", ");
			sb.append("Subtotal: " + o.subTotal() + "\n");			
		}
		
		return sb.toString();
	}
	
	
	
	
}
