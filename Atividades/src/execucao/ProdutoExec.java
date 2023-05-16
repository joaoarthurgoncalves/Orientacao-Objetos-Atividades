package execucao;

import java.util.Scanner;

import modelo.Produto;

public class ProdutoExec {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		for(int i = 1; i < 6; i++) {
		
		Produto prod = new Produto();
	
		
			System.out.println(" Criação de Produto " +i+ ":");
		
			System.out.print("Informe a descrição do produto que deseja: ");
			prod.setDescricao(sc.nextLine());
	
			System.out.print("Informe sua unidade de medida: ");
			prod.setUnidadeMedida(sc.nextLine());
	
			System.out.print("Qual a quantidade? ");
			prod.setQuantidade(Integer.parseInt(sc.nextLine()));
			
			System.out.print("Informe seu valor unitário: ");
			prod.setValorUnitario(Float.parseFloat(sc.nextLine()));
			
		System.out.println("Produto: " +prod.getDescricao()+ "(" 
		+prod.getUnidadeMedida()+ ") | " 
		+prod.getQuantidade()+ " * " 
		+prod.getValorUnitario()+ " = " 
		+prod.getValorTotal()+ "\n");
	
	
	System.out.println();	
	
		
		
	
		}

	sc.close();
	
	}

}
