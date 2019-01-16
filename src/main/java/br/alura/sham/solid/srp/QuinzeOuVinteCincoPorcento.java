package br.alura.sham.solid.srp;

public class QuinzeOuVinteCincoPorcento implements CalculaSalario {

	public double calcula(final Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 2000.0) {
			return funcionario.getSalarioBase() * 0.75;
		} else {
			return funcionario.getSalarioBase() * 0.85;
		}
	}

}
