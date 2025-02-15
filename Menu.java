package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.util.Cores;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;



public class Menu {

	public static void main(String[] args) {
		// executando as classes
			
		//teste da classe conta corrente
		ContaCorrente cc1 = new ContaCorrente (2, 123, 1, "Mariana", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		//teste da classe conta poupança
		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "Victor", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		while (true) {
		System.out.println(Cores.TEXT_GREEN + Cores.TEXT_GREEN_BOLD_BRIGHT
				         + "******************************************");	
		System.out.println("******************************************");
		System.out.println("                                          ");
		System.out.println("           BANCO DO BRAZIL COM Z          ");
		System.out.println("                                          ");
		System.out.println("******************************************");
		System.out.println("                                          ");
		System.out.println("     1 - Criar conta                      ");
		System.out.println("     2 - Listar todas as contas           ");
		System.out.println("     3 - Buscar conta por número          ");
		System.out.println("     4 - Atualizar dados da conta         ");
	    System.out.println("     5 - Apagar conta                     ");
	    System.out.println("     6 - Sacar                            ");
	    System.out.println("     7 - Depositar                        ");
	    System.out.println("     8 - Transferir valores entre contas  ");
	    System.out.println("     9 - Sair                             ");
	    System.out.println("                                          ");
	    System.out.println("******************************************");
	    System.out.println("Entre com a opção desejada:               ");
	    System.out.println("                                          ");
	    System.out.println("                       " + Cores.TEXT_RESET);
	   
	    opcao = leia.nextInt();
	    
	    if(opcao==9) {
	    	System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil"
	    			+ "com Z - O seu furuto começa aqui!");
	    	sobre();
	    	leia.close();
	    	System.exit(0);
	    	
	    }
	    
	    
	    switch(opcao) {
	    
	    case 1:
	    	System.out.println(Cores.TEXT_WHITE + "Criar conta/n/n");
	    	break;
	    case 2:	
	    	System.out.println(Cores.TEXT_WHITE + "Listar todas as contas/n/n");
	        break;
	    case 3:
	    	System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");
	    	break;
	    case 4:
	    	System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
	    	break;
	    case 5:
	    	System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
	    case 6:
			System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
            break;
		case 7:
			System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");			
            break;
		case 8:
			System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n"); 	
			break;
		default:
			System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
            break;
	    }
	    
	 }
}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	   }
}
