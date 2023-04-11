package Lista_2;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		int num1,aj;
		int num2;
		
		System.out.print("Informe o primeiro número: ");
		String valor1Lido = leitor.nextLine();
		num1 = Integer.parseInt(valor1Lido);
		
		System.out.print("Informe o segundo número: ");
		String valor2Lido = leitor.nextLine();
		num2 = Integer.parseInt(valor2Lido);
		
		if(num1<num2) {
            aj=num1;
            num1=num2;
            num2=aj;
		}
	}

}
