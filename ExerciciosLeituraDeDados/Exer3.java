package ExerciciosLeituraDeDados;
import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		float IMC;
		
		Scanner leitor = new Scanner(System.in);
		for(int i=0; i<5; i++) {
		
			System.out.print("Informe seu nome: ");
			String nome = leitor.nextLine();
			
			
			System.out.print("Informe seu peso (em Kg): ");
			String ResulP = leitor.nextLine();
			float peso = Float.parseFloat(ResulP);
		
			System.out.print("Informe sua altura (em M): ");
			String ResulA = leitor.nextLine();
			float altura = Float.parseFloat(ResulA);
		
		IMC = (peso / (altura * altura));
		
		System.out.println(nome + ", o seu IMC é: " + IMC );
		
		}	
	}
}
