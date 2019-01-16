package br.alura.sham.solid.srp;

public enum CargoEnum {
    DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new QuinzeOuVinteCincoPorcento()),
    TESTER(new QuinzeOuVinteCincoPorcento());
    
    CalculaSalario calculaSalario;
    
    CargoEnum(final CalculaSalario cargo) {
    	this.calculaSalario = cargo;
    }

	public CalculaSalario getcalculaSalario() {
		return calculaSalario;
	}
    
}
