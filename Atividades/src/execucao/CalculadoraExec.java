package execucao;

import java.util.Scanner;

import modelo.Calculadora;

public class CalculadoraExec {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	Calculadora c = new Calculadora();
	
	System.out.print("Informe o primeiro número: ");
	c.setNumA(Integer.parseInt(sc.nextLine()));
	
	System.out.print("Informe o segundo número: ");
	c.setNumB(Integer.parseInt(sc.nextLine()));
	
	
	System.out.println(" \n Resultados obtidos: \n Soma -> " + c.soma() + "\n Subtração -> " + c.subtracao() + "\n Multiplicação -> " + c.multiplicacao() + "\n Divisão -> " + c.divisao() + "\n Resto -> " + c.resto());
	
	sc.close();
	}

}
