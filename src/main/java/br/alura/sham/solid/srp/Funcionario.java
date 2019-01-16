package br.alura.sham.solid.srp;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Funcionario {
	private int id;
	private String nome;
	private CargoEnum cargo;
	private Calendar dataDeAdmissao;
	private double salarioBase;
	
	public Double calculaSalario() {
		return this.getCargo().getcalculaSalario().calcula(this);
	}
}
