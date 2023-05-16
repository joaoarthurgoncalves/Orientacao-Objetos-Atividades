package modelo;

public class Calculadora {

	private int numA;
	private int numB;
	
	//Métodos
	public int soma() {
		int soma = this.numA + this.numB;
		return soma;
	}
	
	public int subtracao() {
		return this.numA - this.numB;
			
	}
	
	public int multiplicacao() {
		return this.numA * this.numB;
	}
	
	public int divisao() {
		return this.numA / this.numB;
	}
	
	public int resto() {
		return this.numA % this.numB; 
	}
	
	
	
	//GETs e SETs
	
	public int getNumA() {
		return numA;
	}

	public void setNumA(int numA) {
		this.numA = numA;
	}

	public int getNumB() {
		return numB;
	}

	public void setNumB(int numB) {
		this.numB = numB;
	}

	
}
