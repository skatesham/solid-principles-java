package br.alura.sham.solid.acoplamento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotaFiscal {

	private int id;
	private double valorBruto;
	private double impostos;

	public NotaFiscal(final double valor, final double impostoSimplesSobreO) {
		this.valorBruto = valor;
		this.impostos = impostoSimplesSobreO;
	}

}
