package br.alura.sham.solid.encapsulamento;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Fatura {

	private String cliente;
	private double valor;
	private List<Pagamento> pagamentos = new LinkedList<Pagamento>();
	private boolean pago;
	private double totalPagamento = 0;

	public void addPagamento(final Pagamento pagamento) {
		pagamentos.add(pagamento);
		totalPagamento += pagamento.getValor();
		this.setFaturaPaga();
	}

	private void setFaturaPaga() {
		if (this.valor >= totalPagamento) {
			this.setPago(true);
		}
	}

	public List<Pagamento> getPagamentos() {
		return Collections.unmodifiableList(this.pagamentos);
	}

}
