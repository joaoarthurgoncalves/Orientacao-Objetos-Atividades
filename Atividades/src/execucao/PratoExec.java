package execucao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Prato;

public class PratoExec {

	public static void main(String[] args) {

		List<Prato> Lista = new ArrayList<>();
		
		Scanner sc = new Scanner (System.in);
		
	Double Valor = 0.0;
		
		for(int i=1; i<=3; i++) {
			
			Prato prat = new Prato();
			
			System.out.println("/-----/Prato " +i+ "/-----/");
			
			System.out.print("Qual é a descrição do prato?");
			String descricao = sc.nextLine();
			prat.setDescricao(descricao);
		
			System.out.print("Quantos pratos gostaria de levar??");
			Integer quantidade = (Integer.parseInt(sc.nextLine()));
			prat.setQuantidade(quantidade);
		
			System.out.print("Qual o valor unitário?");
			Double valorUnitario = (Double.parseDouble(sc.nextLine()));
			prat.setValorUnitario(valorUnitario);
			
			Valor = Valor + prat.getValorTotal();
			
			Lista.add(prat);
			
			System.out.println("\n");
			
		}
		sc.close();
		
		System.out.println("/-------Pratos Registrados-------/");
		for(Prato pt : Lista) {
			System.out.println(pt.getInfo());
			
			
			System.out.println("O valor total gasto com a janta foi de: "+Valor+" reais.");
		}
	}
}
