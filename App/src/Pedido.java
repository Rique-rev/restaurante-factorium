import java.util.Random;

public class Pedido {
	
	public String cliente;
	public String ultimoPedido;
	public boolean pedidoPendente = true;
	public double valorTotal = 0.0;
	private double taxa = 0.5;
	
	//construtores =============================================================
	public Pedido(String cliente, String ultimoPedido, double valorTotal) {
		this.cliente = cliente;
		this.ultimoPedido = ultimoPedido;
		this.valorTotal = valorTotal;
		
	}
	
	public Pedido(String cliente, String ultimoPedido) {
		this.cliente = cliente;
		this.ultimoPedido = ultimoPedido;
	}
	
	//metodos ==================================================================
	public void fazPedido() {
		this.calculaValor();
	}
	
	public void entregaPedido() {
		this.pedidoPendente = false;
		
	}
	
	private void calculaValor() {
		Random random = new Random();
		int valorAleatorio = random.nextInt(51);
		double valorFinal = valorAleatorio + valorAleatorio * taxa; // 50% lucro
		this.valorTotal = valorFinal;
	}
	
	//getteres e setteres ======================================================
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getUltimoPedido() {
		return ultimoPedido;
	}

	public void setUltimoPedido(String ultimoPedido) {
		this.ultimoPedido = ultimoPedido;
	}

	public boolean isPedidoPendente() {
		return pedidoPendente;
	}

	public void setPedidoPendente(boolean pedidoPendente) {
		this.pedidoPendente = pedidoPendente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
