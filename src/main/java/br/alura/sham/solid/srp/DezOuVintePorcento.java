package br.alura.sham.solid.srp;

public class DezOuVintePorcento implements CalculaSalario {

	public double calcula(final Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}

}
