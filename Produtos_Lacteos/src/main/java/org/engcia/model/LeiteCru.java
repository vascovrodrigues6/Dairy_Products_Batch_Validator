package org.engcia.model;

import org.engcia.produtosLacteos.ProdutosLacteos;

public class LeiteCru extends Fact {
	
    public static final String COAGULA_PROVA_ALCOOL = "Coagula na prova de álcool";
    public static final String EXISTE_CONTAMINANTES_NEUTRALIZANTES = "Existe contaminantes ou neutralizantes";
    public static final String EXISTE_INIBIDORES = "Existe inibidores";
    public static final String CRIOSCOPIA = "Existe água(Crioscopia)";
    public static final String EXISTE_MICRO_ORGANISMOS = "Existe micro-organismos";
    public static final String FOSFATASE = "Fosfatase";


    private String evidence;
    private String value;

    public LeiteCru(String ev, String v) {
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

