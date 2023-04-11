package Lista_2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
			
		System.out.print("Informe o primeiro número: ");
		String valor1Lido = leitor.nextLine();
		num1 = Integer.parseInt(valor1Lido);
		
		System.out.print("Informe o segundo número: ");
		String valor2Lido = leitor.nextLine();
		num2 = Integer.parseInt(valor2Lido);
		
		System.out.print("Informe o terceiro número: ");
		String valor3Lido = leitor.nextLine();
		num3 = Integer.parseInt(valor3Lido);
	
		if(num1<num2 && num1<num3) {
		System.out.println("O menor número é o "+ num1);
			}
		if(num2<num1 && num2<num3) {
			System.out.println("O menor número é o "+ num2);
			}
		if(num3<num1 && num3<num2) {
			System.out.println("O menor número é o "+ num3);
			}
		}
	}
