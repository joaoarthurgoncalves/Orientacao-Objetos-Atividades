package modelo;

import java.util.List;

public class Posto {
	
	//Métodos
	private Integer litrosGasolina;
	private List<Integer> abastecimentosGasolina;
	 
	
	//GETS and SETs
	public Integer getLitrosGasolina() {
		return litrosGasolina;
	}

	public void setLitrosGasolina(Integer litrosGasolina) {
		this.litrosGasolina = litrosGasolina;
	}
	
	public void reporEstoque(Integer litros) {
		this.litrosGasolina += litros;
	}
	
	public Boolean abastecer(Integer litros) {
		//Veri
	if(litros <= this.litrosGasolina) {
	//Pode abastecer
		this.litrosGasolina -= litros;
		
	
	}
	return false;
	}

	public List<Integer> getAbastecimentosGasolina() {
		return abastecimentosGasolina;
	}

	public void setAbastecimentosGasolina(List<Integer> abastecimentosGasolina) {
		this.abastecimentosGasolina = abastecimentosGasolina;
	}
	
}
