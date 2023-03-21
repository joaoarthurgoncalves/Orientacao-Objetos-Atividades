package LIstaExercicios2103;

public class Exer3 {

	public static void main(String[] args) {
		// Exercício 3
		for(int ano=1980; ano<=2023; ano++) {

		if((ano % 4 == 0 && ano % 100 !=0) || (ano % 400 ==0))
			System.out.println(ano);
		}
	}
}