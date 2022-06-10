package org.engcia.model;

import org.engcia.produtosLacteos.ProdutosLacteos;

public class LeiteEmPo extends Fact {

    public static final String TIPO_LEITE_EM_PO = "Qual é o tipo de leite";
    public static final String ASPETO_LEITE_PO = "É Homogéneo";
    public static final String COR_LEITE_PO = "Tem cor branca ou branca amarelada";
    public static final String AROMA_E_SABOR_LEITE_PO = "Aroma e sabor Característico do leite e sem anomalias";

    public static final String CONTAGEM_MICROORGANISMOS_30GRAUS_LEITE_PO = "Contagem de microorganismos a 30ºC/g";
    public static final String EXISTENCIA_INIBIDORES_LEITE_PO = "Existem inibidores";

    public static final String ACIDEZ_LEITE_PO_MAGRO = "Acidez";
    public static final String ACIDEZ_LEITE_PO_GORDO = "Acidez";
    public static final String HUMIDADE_LEITE_PO = "Humidade";
    //public static final String HUMIDADE_LEITE_PO_LEGISLACAO = "Humidade";
    public static final String PH_LEITE_PO = "PH";
    public static final String PROVA_DE_ALCOOL_LEITE_PO = "Coagula";
    public static final String FLORA_AEROBIA_MESOFILA_LEITE_PO_INTERNA = "Flora aeróbia mesófila";
    public static final String FLORA_AEROBIA_MESOFILA_LEITE_PO_LEGISLACAO = "Flora aeróbia mesófila";
    public static final String BACTERIAS_COLIFORMES_LEITE_PO= "Bactérias coliformes - teste negativo"; //negativo
    public static final String ECOLI_LEITE_PO = "E.Coli - teste negativo"; //negativo
    public static final String BOLORES_E_LEVEDURAS_LEITE_PO = "Bolores e leveduras";
    public static final String MATERIA_GORDA_LEITE_PO_GORDO = "Matéria gorda";
    public static final String MATERIA_GORDA_LEITE_PO_MAGRO_INTERNA = "Matéria gorda";
    public static final String MATERIA_GORDA_LEITE_PO_MAGRO_LEGISLACAO = "Matéria gorda";
    //public static final String HUMIDADE_LEITE_PO_LEGISLACAO = "Matéria gorda entre 26.0 a 42.0";
    public static final String FOSFATASE_LEITE_PO = "Fosfatase"; //negativo


    private String evidence;
    private String value;

    public LeiteEmPo(String ev, String v) {
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
