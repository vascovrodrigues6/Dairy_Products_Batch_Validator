package org.engcia.model;

import org.engcia.produtosLacteos.ProdutosLacteos;

public class LeiteAchocolatado extends Fact {

    public static final String DENSIDADE_LEITE_ACHOCOLATADO = "Densidade";
    public static final String PH_SEM_INCUBACAO_LEITE_ACHOCOLATADO = "PH sem incubação";
    public static final String PH_COM_INCUBACAO_LEITE_ACHOCOLATADO = "PH com incubação";
    public static final String PROVA_DE_ALCOOL_LEITE_ACHOCOLATADO = "Coagula na prova de álcool";
    public static final String ACIDEZ_NAOH_L_SEM_INCUBACAO_LEITE_ACHOCOLATADO = "Acidez NAOH/L sem incubação";
    public static final String ACIDEZ_NAOH_L_COM_INCUBACAO_LEITE_ACHOCOLATADO = "Acidez NAOH/L com incubação";
    public static final String MATERIA_GORDA_LEITE_ACHOCOLATADO= "Matéria gorda";
    public static final String MATERIA_PROTEICA_LEITE_ACHOCOLATADO = "Matéria proteica";
    public static final String HIDRATOS_DE_CARBONO_LEITE_ACHOCOLATADO = "Hidratos de carbono";
    public static final String ESD_EXTRATO_SECO_LEITE_ACHOCOLATADO = "E.S.D (Extrato seco)";
    public static final String MATERIA_AEROBICA_LEITE_ACHOCOLATADO = "Matéria aeróbica";
    public static final String MATERIA_ANAEROBICA_LEITE_ACHOCOLATADO = "Matéria anaeróbica";


    private String evidence;
    private String value;

    public LeiteAchocolatado(String ev, String v) {
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