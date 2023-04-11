package Lista_2;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner leitor = new Scanner(System.in);
		int num;
		int resuinf;
			
		System.out.print("Informe um número: ");
		String valorLido = leitor.nextLine();
		num = Integer.parseInt(valorLido);
	
		if(num>0) {
		resuinf = num * 2;
		System.out.println("(POSITIVO) O dobro do número é:" + resuinf);
		}else{
		resuinf = num * 3;
		System.out.println("(NEGATIVO) O triplo do número é:" + resuinf);
		}
	
		

	}

}
