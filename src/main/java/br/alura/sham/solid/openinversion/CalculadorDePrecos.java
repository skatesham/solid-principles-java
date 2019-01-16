package br.alura.sham.solid.openinversion;

public class CalculadorDePrecos {

	private Preco tabela;
	private Entrega entrega;

	public CalculadorDePrecos(final Preco tabela, final Entrega entrega) {
		this.tabela = tabela;
		this.entrega = entrega;

	}

	public double calcula(final Compra produto) {

		double desconto = tabela.descontoPara(produto.getValor());
		double frete = entrega.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}

}
