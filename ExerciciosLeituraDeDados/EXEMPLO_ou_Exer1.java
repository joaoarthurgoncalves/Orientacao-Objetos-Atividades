package ExerciciosLeituraDeDados;
import java.util.Scanner;
public class EXEMPLO_ou_Exer1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
		
			System.out.print("Informe um número: ");
			
			String lido = leitor.nextLine();
			
			Integer num = Integer.parseInt(lido);
					
			//Verificar se o número é positivo ou negativo
			if(num >= 0)
				System.out.println("O Número é Positivo.");
			else
				System.out.println("O Número é Negativo.");
			
			//System.out.println("O valor lido foi: " + lido);
			
		}
		
		leitor.close();
	}

}
