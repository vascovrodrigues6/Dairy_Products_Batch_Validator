package org.engcia.model;

import org.engcia.produtosLacteos.ProdutosLacteos;

public class Conclusion extends Fact{
	
    public static final String ACEITAR = "O lote é aceite";
    public static final String REJEITAR_QUALIDADE_INTERNA = "O lote é rejeitado de acordo com a qualidade interna";
    public static final String REJEITAR_LEGISLACAO = "O lote é rejeitado de acordo com a legislação";
    public static final String SAIR = "A sair do sistema";
    public static final String DESCONHECIDO = "Valor desconhecido ao sistema";

    private String description;

    public Conclusion(String description) {
        this.description = description;
        ProdutosLacteos.agendaEventListener.addRhs(this);
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return ("Conclusão: " + description);
    }

}
