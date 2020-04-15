/**
 * @author Henrique Ribeiro Evangelista
 * RM 82136
 *
 */

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean continuar = true;
		
		
		System.out.println("Insira o nome de quem fez o pedido: ");
		String nome = scan.nextLine();
		
		System.out.println("Insira o nome do prato pedido: ");
		String prato = scan.nextLine();
		
		TesteRestaurante testeRestaurante = new TesteRestaurante(nome, prato);

		testeRestaurante.fazPedido();
		System.out.println("Pedido Registrado !\n");
	
		while(continuar) {
			
			System.out.println("---------------------------------------");
			System.out.println("O que voce deseja fazer agora?\n"
					+ "1: Consultar status do pedido\n"
					+ "2: Concluir pedido\n"
					+ "3: Sair\n"
					+ "Selecione uma das opcoes acima: ");
			
			String acao = scan.nextLine();
			
			switch(acao) {
			
			case "1":
				System.out.println(testeRestaurante.statusUltimoPedido());
				break;
			
			case "2":
				testeRestaurante.entregaPedido();
				System.out.println("Pedido concluido\n");
				System.out.println("Deseja fazer outro pedido? (sim/nao)");
				boolean novoPedido = scan.nextLine().equals("sim");

				if(novoPedido) {

					System.out.println("Insira o nome de quem fez o pedido: ");
					nome = scan.nextLine();
					
					System.out.println("Insira o nome do prato pedido: ");
					prato = scan.nextLine();
					
					testeRestaurante.setCliente(nome);
					testeRestaurante.setUltimoPedido(prato);
					testeRestaurante.setPedidoPendente(true);
					testeRestaurante.fazPedido();
					System.out.println("Pedido Registrado !\n");
				}
				else {
					break;
				}
				break;
			
			case "3":
				System.out.println("Obrigado pela sua participacao !");
				continuar = false;
				break;
			}			
		}
	}

}
