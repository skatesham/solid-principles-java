package br.alura.sham.solid.acoplamento;

import java.util.List;

public class GeradorDeNotaFiscal {

	List<AcaoNota> acoes;
	
    public GeradorDeNotaFiscal(final List<AcaoNota> acoes) {
    	this.acoes = acoes;
    }

    public NotaFiscal gera(final Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));
        
        for(AcaoNota acao : this.acoes) {
        	acao.executa(nf);
        }

        return nf;
    }

    private double impostoSimplesSobreO(final double valor) {
        return valor * 0.06;
    }
}
