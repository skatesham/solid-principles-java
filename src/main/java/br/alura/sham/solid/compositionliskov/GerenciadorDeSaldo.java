package br.alura.sham.solid.compositionliskov;

public class GerenciadorDeSaldo {

	private double saldo;

	public void deposita(final double valor) {
		this.saldo += valor;
	}

	public void saca(final double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void rende(final double taxa) {
		this.saldo *= taxa;
	}

	public double getSaldo() {
		return saldo;
	}

}
