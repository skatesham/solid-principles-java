package br.alura.sham.solid.encapsulamento;

import java.util.List;

public class ProcessadorDeBoleto {

	public void processa(final List<Boleto> boletos, final Fatura fatura) {

		for (Boleto boleto : boletos) {
			Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
			fatura.addPagamento(pagamento);
		}
	}
}
