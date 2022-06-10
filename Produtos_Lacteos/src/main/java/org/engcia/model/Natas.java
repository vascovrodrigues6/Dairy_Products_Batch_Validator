package org.engcia.model;

import org.engcia.produtosLacteos.ProdutosLacteos;

public class Natas extends Fact {

    public static final String NATAS_ASPETO_ESTUFA_30GRAUS = "Aspeto na estufa de 30ºC - É homogéneo";
    public static final String NATAS_ASPETO_ESTUFA_50GRAUS = "Aspeto na estufa de 50ºC - É homogéneo";
    public static final String NATAS_COR_ESTUFA_30GRAUS = "Cor na estufa de 30ºC - Branco ou branco amarelado";
    public static final String NATAS_COR_ESTUFA_50GRAUS = "Cor na estufa de 50ºC - Branco ou branco amarelado";
    public static final String NATAS_AROMA_E_SABOR_ESTUFA_30GRAUS = "Aroma e sabor na estufa de 30ºC - Característico do leite e sem anomalias";
    public static final String NATAS_AROMA_E_SABOR_ESTUFA_50GRAUS = "Aroma e sabor na estufa de 50ºC - Característico do leite e sem anomalias";

    public static final String NATAS_FOSFATASE= "Fosfatase - Teste negativo";
    public static final String NATAS_RESIDUOS= "Isento Resíduos";
    public static final String NATAS_PH_SEM_INCUBACAO= "Ph sem incubação";
    public static final String NATAS_PH_COM_INCUBACAO= "Ph com incubação";
    public static final String NATAS_ACIDEZ_NAOHL= "Acidez NAOH/L";
    public static final String NATAS_MATERIA_GORDA = "Materia gorda";
    public static final String NATAS_BATEDURA= "Tempo de Batedura (Em minutos)";
    public static final String NATAS_MATERIA_AEROBICA= "matéria aeróbica";
    public static final String NATAS_MATERIA_ANAEROBICA= "Matéria anaeróbica";

    private String evidence;
    private String value;

    public Natas(String ev, String v) {
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
