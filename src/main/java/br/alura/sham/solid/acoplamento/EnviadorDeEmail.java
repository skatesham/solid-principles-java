package br.alura.sham.solid.acoplamento;

public class EnviadorDeEmail implements AcaoNota {

	public void enviaEmail(final NotaFiscal nf) {
		System.out.println("envia email da nf " + nf.getId());
	}

	public void executa(final NotaFiscal nf) {
		this.enviaEmail(nf);
		}
}