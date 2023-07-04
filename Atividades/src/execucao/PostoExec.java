package execucao;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Posto;

public class PostoExec {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Posto posto = new Posto();
		posto.setLitrosGasolina(0);
		posto.setAbastecimentosGasolina(new ArrayList<>());

		Integer opcao;
		System.out.println("\n ---PAINEL DE CONTROLE -> POSTO DE GASOLINA---");
		System.out.println("|Opções:                    \n");
		System.out.println("(1) Abastecer              ");
		System.out.println("(2) Repôr estoque                 ");
		System.out.println("(3) Listar abastecimentos           ");
		System.out.println("(0) Sair do programa       ");
		System.out.println("---/---/---/---/---/---/");
		System.out.print("Digite uma opção: ");
		
		opcao = Integer.parseInt(sc.nextLine());
		}
	}

