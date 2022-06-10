package org.engcia.model;

import org.engcia.produtosLacteos.ProdutosLacteos;

public class Manteiga extends Fact {

    // Manteiga - Escolha
    public static final String ESTADO= "Qual é o estado da manteiga";
    //Manteiga - Estado de preparação
    public static final String MANTEIGA_PREPARACAO_MICRORGANISMOS = "Microrganismos";
    public static final String MANTEIGA_PREPARACAO_BACTERIAS_COLIFORMES = "Bacterias coliformes";
    public static final String MANTEIGA_PREPARACAO_ECOLI_AGUA_PASTEURIZADA = "E.Coli (Água pasteurizada)";
    public static final String MANTEIGA_PREPARACAO_BACTERIAS_COLIFORMES_LEITELHO_INTERMEDIO = "Bactérias coliformes (Leitelho intermédio)";
    public static final String MANTEIGA_PREPARACAO_ECOLI_LEITELHO_INTERMEDIO = "E.Coli (leitelho intermédio)";
    public static final String MANTEIGA_PREPARACAO_BACTERIAS_COLIFORMES_NATA_PASTEURIZADA = "Bactérias coliformes (Nata pasteurizada)";
    public static final String MANTEIGA_PREPARACAO_ECOLI_NATA_PASTEURIZADA = "E.Coli (Nata pasteurizada)";
    public static final String MANTEIGA_PREPARACAO_BOLORES_E_LEVEDURAS_NATA_PASTEURIZADA = "Bolores e leveduras (Nata pasteurizada)";
    public static final String MANTEIGA_PREPARACAO_FLORA_AEROBIA_MESOFILA_NATA_PASTEURIZADA = "Flora aeróbia mesófila (Nata pasteurizada)";
    public static final String MANTEIGA_PREPARACAO_BACTERIAS_COLIFORMES_LEITELHO_PASTEURIZADO = "Bactérias coliformes (Leitelho pasteurizado)";
    public static final String MANTEIGA_PREPARACAO_ECOLI_LEITELHO_PASTEURIZADO = "E.Coli (leitelho pasteurizado) <=1 ou Negativo";

    public static final String MANTEIGA_PREPARACAO_BOLORES_E_LEVEDURAS_LEITELHO_PASTEURIZADO = "Bolores e leveduras (leitelho pasteurizado)";
    public static final String MANTEIGA_PREPARACAO_FOSFATASE_LEITELHO_PASTEURIZADO = "Fosfatase (leitelho pasteurizado) - teste negativo";
    public static final String MANTEIGA_PREPARACAO_BACTERIAS_COLIFORMES_FERMENTO = "bactérias coliformes (fermento)";
    public static final String MANTEIGA_PREPARACAO_ECOLI_FERMENTO = "E.Coli (fermento)";
    public static final String MANTEIGA_PREPARACAO_BOLORES_E_LEVEDURAS_FERMENTO = "Bolores e leveduras (fermento)";
    public static final String MANTEIGA_PREPARACAO_PH_FERMENTO= "PH (fermento)";
    public static final String MANTEIGA_PREPARACAO_ACIDEZ_NAOHL_FERMENTO = "Acidez NAOH/L (fermento)";
    public static final String MANTEIGA_PREPARACAO_BACTERIAS_COLIFORMES_FERMENTO_ACIDIFICADO = "Bactérias coliformes (fermento acidificado)";
    public static final String MANTEIGA_PREPARACAO_ECOLI_FERMENTO_ACIDIFICADO = "E.Coli (fermento acidificado)";
    public static final String MANTEIGA_PREPARACAO_BOLORES_E_LEVEDURAS_FERMENTO_ACIDIFICADO = "Bolores e leveduras (fermento acidificado)";
    public static final String MANTEIGA_PREPARACAO_PH_FERMENTO_ACIDIFICADO = "PH (fermento acidificado)";
    //Manteiga - Saída da Batedeira
    public static final String MANTEIGA_SAIDA_BATEDEIRA_BACTERIAS_COLIFORMES = "Bactérias coliformes";
    public static final String MANTEIGA_SAIDA_BATEDEIRA_ECOLI = "E.Coli";
    public static final String MANTEIGA_SAIDA_BATEDEIRA_BOLORES_E_LEVEDURAS = "Bolores e leveduras";
    public static final String MANTEIGA_SAIDA_BATEDEIRA_CHEIRO_E_SABOR = "Cheiro e sabor caraterísticos da manteiga e sem anomalias";
    //Manteiga - Depois de Embalada
    public static final String MANTEIGA_DEPOIS_DE_EMBALADA_BACTERIAS_COLIFORMES = "Bactérias coliformes";
    public static final String MANTEIGA_DEPOIS_DE_EMBALADA_ECOLI = "E.Coli";
    public static final String MANTEIGA_DEPOIS_DE_EMBALADA_BOLORES_E_LEVEDURAS = "Bolores e leveduras";
    public static final String MANTEIGA_DEPOIS_DE_EMBALADA_ASPETO = "Aspeto homogéneo e enxuto com textura compacta";
    public static final String MANTEIGA_DEPOIS_DE_EMBALADA_COR = "Cor amarela, mais ou menos intenso";
    public static final String MANTEIGA_DEPOIS_DE_EMBALADA_AROMA = "Aroma fresco e perfeito/percétivel";
    public static final String MANTEIGA_DEPOIS_DE_EMBALADA_SABOR = "Sabor fresco e agradável";
    public static final String MANTEIGA_DEPOIS_DE_EMBALADA_PH_SEM_SAL = "PH sem sal";
    public static final String MANTEIGA_DEPOIS_DE_EMBALADA_PH_COM_SAL = "PH com sal";
    public static final String MANTEIGA_DEPOIS_DE_EMBALADA_PH_ACIDA = "PH ácida";
    public static final String MANTEIGA_DEPOIS_DE_EMBALADA_ACIDEZ_OLEICA = "Acidez oleica";
    public static final String MANTEIGA_DEPOIS_DE_EMBALADA_MATERIA_GORDA_COM_SAL = "Matéria gorda com sal";
    public static final String MANTEIGA_DEPOIS_DE_EMBALADA_MATERIA_GORDA_SEM_SAL = "Matéria gorda sem sal";
    public static final String MANTEIGA_DEPOIS_DE_EMBALADA_TEOR_AGUA = "Teor de água";
    public static final String MANTEIGA_DEPOIS_DE_EMBALADA_CLORETOS_COM_SAL = "Cloretos com sal";
    public static final String MANTEIGA_DEPOIS_DE_EMBALADA_RESIDUO_SECO_ISENTO_MATERIA_GORDA = "Resíduo seco isento de matéria gorda";







    private String evidence;
    private String value;

    public Manteiga(String ev, String v) {
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