package br.alura.sham.solid.encapsulamento;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class Pagamento {
	
	private double valor;
	private MeioDePagamento forma;
	
}
