package execucao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Pessoa;

public class PessoaExec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> lista = new ArrayList<>();
		
		Integer opcao;
		do {

			System.out.println("---PESSOAS: MENU DE CADASTRO---");
			System.out.println("|Opções:                    \n");
			System.out.println("(1) Cadastrar              ");
			System.out.println("(2) Listar                 ");
			System.out.println("(3) Excluir                ");
			System.out.println("(4) Excluir todos          ");
			System.out.println("(0) Sair do programa       ");
			System.out.println("---/---/---/---/---/---/");
			System.out.print("Digite uma opção: ");
			opcao = Integer.parseInt(sc.nextLine());
			
			if(opcao == 1) {
				//CADASTRAR
				System.out.println();
				System.out.println("Cadastro da pessoa");
				
				Pessoa pp = new Pessoa();
				
				System.out.print("Informe o nome: ");
				pp.setNome(sc.nextLine());
				
				System.out.print("Informe o sobrenome: ");
				pp.setSobrenome(sc.nextLine());
				lista.add(pp);
				
			} else if(opcao == 2) {
				//Listar Pessoas Cadastradas
				System.out.println("Listagem das pessoas cadastradas: ");
				for(Pessoa pes : lista) {
					System.out.println(pes.getInfo());
				}
				
			} else if(opcao == 3) {
				//Excluir Pessoa (com base no índice)
				System.out.println();
				System.out.println("Exclusão de pessoa");
				
				System.out.print("Informe o índice a excluir: ");
				Integer indice = Integer.parseInt(sc.nextLine());
				if(indice <= lista.size()-1) {
				//Excluir
					lista.remove(indice.intValue());
				} else
					System.out.println("Este valor de índice não está cadastrado!");
			
			} else if(opcao == 4) {
				//Excluir todas as pessoas cadastradas.
			
			System.out.println("Exclusão realizada com sucesso.");
				while(lista.size() > 0)
					lista.remove(0);
		
				
			} else if(opcao == 0) {
				System.out.println("Fim do programa!");
			
			} else 
				System.out.println("Opção inválida!");
	
		} while (opcao != 0);
	
		sc.close();
	}
}

