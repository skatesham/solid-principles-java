package br.alura.sham.solid.acoplamento;

public class NotaFiscalDao implements AcaoNota {

    public void persiste(final NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }

	public void executa(final NotaFiscal nf) {
		this.persiste(nf);
	}
}