package org.engcia.model;

import org.engcia.produtosLacteos.ProdutosLacteos;

public class LeiteGordo extends Fact {
	
    public static final String ESTUFA_30_ASPETO = "Aspeto da amostra na estufa a 30ºC é homogéneo e sem impurezas ";
    public static final String ESTUFA_30_COR = "Cor da amostra na estufa a 30ºC é branco ou branco amarelado ";
    public static final String ESTUFA_30_AROMA_SABOR = "Aroma e Sabor da amostra na estufa a 30ºC é característico do leite e sem anomalias";
    public static final String ESTUFA_50_ASPETO = "Aspeto da amostra na estufa a 50ºC é homogéneo e sem impurezas ";
    public static final String ESTUFA_50_COR = "Cor da amostra na estufa a 50ºC é branco ou branco amarelado ";
    public static final String ESTUFA_50_AROMA_SABOR = "Aroma e Sabor da amostra na estufa a 50ºC é característico do leite e sem anomalias";
    public static final String DENSIDADE = "Densidade";
    public static final String RESIDUOS = "Resíduos";
    public static final String PH_SEM_INCUBACAO = "PH sem incubação";
    public static final String PH_COM_INCUBACAO = "PH com incubação";
    public static final String COAGULA_PROVA_ALCOOL = "Coagula na prova de álcool";
    public static final String ACIDEZ_SEM_INCUBACAO = "Acidez NAOH/L sem incubação";
    public static final String ACIDEZ_COM_INCUBACAO = "Acidez NAOH/L com incubação";
    public static final String MATERIA_GORDA = "Matéria Gorda";
    public static final String MATERIA_PROTEICA = "Matéria Próteica";
    public static final String LACTOSE = "Lactose";
    public static final String E_S_D = "E.S.D";
    public static final String TEMPO_DETECAO_ESTERILIDADE = "Tempo de deteção de Esterilidade";
    public static final String MATERIA_AEROBICA = "Matéria Aeróbica";
    public static final String MATERIA_ANAEROBICA = "Matéria Anaeróbica";


    private String evidence;
    private String value;

    public LeiteGordo(String ev, String v) {
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

