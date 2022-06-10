package org.engcia.model;

import org.engcia.produtosLacteos.ProdutosLacteos;

public class LeitePasteurizado extends Fact {

    public static final String EXISTE_MICRO_ORGANISMOS = "Existe micro-organismos";
    public static final String FOSFATASE = "Fosfatase";


    private String evidence;
    private String value;

    public LeitePasteurizado(String ev, String v) {
        evidence = ev;
        value = v;
        //ProdutosLacteos.agendaEventListener.addRhs(this);
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

