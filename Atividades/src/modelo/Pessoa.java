package modelo;


public class Pessoa {
	
	private String nome;
	private String sobrenome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getInfo() {
		String info = "Nome: " + this.nome;
		info += " - Sobrenome: " + this.sobrenome; 
		return info;
	}
}
