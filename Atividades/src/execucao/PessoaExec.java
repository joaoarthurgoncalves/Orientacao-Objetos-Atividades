package execucao;

import java.util.Scanner;
import modelo.Pessoa;
import java.util.List;
import java.util.ArrayList;

public class PessoaExec {

	public static void main(String[] args) {
		
		Pessoa x = new Pessoa();
	List<Pessoa> Pessoas = new ArrayList<>();  
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Informe um nome: ");
	x.setNome(sc.nextLine());
	
	System.out.print("Informe o sobrenome:");
	x.setSobrenome(sc.nextLine());
	
	Pessoas.add(x);
	
	for(Pessoa p : Pessoas) {
		System.out.println(" \nNome completo: " + p.getNome() + " "+ p.getSobrenome());
	
	
		}
	}

}
