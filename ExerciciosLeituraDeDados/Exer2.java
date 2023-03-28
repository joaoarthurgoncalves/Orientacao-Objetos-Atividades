package ExerciciosLeituraDeDados;
import java.util.Scanner;
public class Exer2 {

	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.print("Informe um número: ");
	
	int lido = leitor.nextInt();
		
	System.out.println("Os números antecessores desse são: ");
		
		for(int i=lido-1; i>=1; i--)
		
		if(i == 1)
			
			System.out.print(i);
		else 
		System.out.print (i + ", ");
	}

}
