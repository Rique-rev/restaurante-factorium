import java.text.NumberFormat;
import java.util.Locale;

public class TesteRestaurante extends Pedido{


	//construtores ===============================================================================
	public TesteRestaurante(String cliente, String ultimoPedido, double valorTotal) {
		super(cliente, ultimoPedido, valorTotal);
	}

	public TesteRestaurante(String cliente, String ultimoPedido) {
		super(cliente, ultimoPedido);
	}
	
	//metodos ====================================================================================
	public String statusUltimoPedido() {
		StringBuilder statusPedido = new StringBuilder();
		statusPedido.append(super.getCliente()).append(" pediu ").append(super.getUltimoPedido())
			.append(" no valor de ").append(this.formataValor(super.getValorTotal()));
		
		if(super.isPedidoPendente()){
			statusPedido.append("\nO pedido esta pendente");
		}else {
			statusPedido.append("\nO pedido foi concluido");
		}
			
		return statusPedido.toString();
	}
	
	private String formataValor(double valor) {
		Locale ptBr = new Locale("pt", "BR");
		String valorFormatado = NumberFormat.getCurrencyInstance(ptBr).format(valor);
				
		return valorFormatado;
	}
	
		
}
