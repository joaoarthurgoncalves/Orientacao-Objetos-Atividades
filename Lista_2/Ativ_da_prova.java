package Lista_2;

import java.util.Scanner;

public class Ativ_da_prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int num;
		do {
			System.out.print("Informe um número");
			String valorLido = leitor.nextLine();
		num = Integer.parseInt(valorLido);
		
		int resto = num % 2;

		} while(num != 0);
		
		leitor.close();
	}

}
