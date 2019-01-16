package br.alura.sham.solid.openinversion;

public class Frete implements Entrega {

	public double para(final String cidade) {
		if ("SAO PAULO".equals(cidade.toUpperCase())) {
			return 15;
		}
		return 30;
	}

}