package br.alura.sham.solid.compositionliskov;

public class ContaDeEstudante {

	private int milhas;

	private GerenciadorDeSaldo saldo;

	public ContaDeEstudante() {
		this.saldo = new GerenciadorDeSaldo();
	}

	public void saca(final double valor) {
		if (valor <= this.saldo.getSaldo()) {
			this.saldo.saca(valor);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void deposita(final double valor) {
		this.saldo.deposita(valor);
		this.milhas += (int) valor;
	}

	public int getMilhas() {
		return milhas;
	}

	public double getSaldo() {
		return saldo.getSaldo();
	}

}
