package br.alura.sham.solid.compositionliskov;

public class ContaComum {

	private GerenciadorDeSaldo saldo;

	public ContaComum() {
		saldo = new GerenciadorDeSaldo();
	}

	public void deposita(final double valor) {
		this.saldo.deposita(valor);
	}

	public void saca(final double valor) {
		if (valor <= this.saldo.getSaldo()) {
			this.saldo.saca(valor);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void rende() {
		this.saldo.rende(1.1);
	}

	public double getSaldo() {
		return saldo.getSaldo();
	}
}
