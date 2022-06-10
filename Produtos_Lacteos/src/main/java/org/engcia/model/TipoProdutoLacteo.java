package org.engcia.model;

public class TipoProdutoLacteo extends Fact {
	
    public static final String TIPO = "Tipo de Produto lácteo";

    private String evidence;
    private String value;

    public TipoProdutoLacteo(String ev, String v) {
        evidence = ev;
        value = v;
    }

    public String getEvidence() {
        return evidence;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return (evidence + " = " + value);
    }

}

